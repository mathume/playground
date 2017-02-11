package com.mathume.playground.datastructures.sorting;

import com.mathume.playground.datastructures.Perm;
import org.apache.commons.lang.ArrayUtils;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThan;

/**
 * Created by sebastian on 11/02/17.
 */
public class IntSorterTests {
    static final int LENGTH = 3;
    int[] array;
    List<Integer[]> perms;
    IntSorter sorter;

    public IntSorterTests() {
        array = new int[LENGTH];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        perms = Perm.all(array);
    }

    private void test_sort() {
        for (int i = 0; i < 2; i++) {
            int[] array = ArrayUtils.toPrimitive(perms.get(i));
            this.sorter.sort(array);
            for (int j = 0; j < array.length - 1; j++) {
                assertThat(array[j], is(lessThan(array[j + 1])));
            }
        }
    }

    @Test
    public void BubbleSort() {
        this.sorter = new BubbleSorter();
        this.test_sort();
    }

    @Test
    public void SelectionSort() {
        this.sorter = new SelectionSort();
        this.test_sort();
    }

    @Test
    public void InsertionSort(){
        this.sorter = new InsertionSort();
        this.test_sort();
    }

    @Test
    public void ShellSort(){
        this.sorter = new ShellSort();
        this.test_sort();
    }

    @Test
    public void QuickSort(){
        this.sorter = new QuickSort();
        this.test_sort();
    }

    @Test
    public void HeapSort(){
        this.sorter = new HeapSort();
        this.test_sort();
    }
}
