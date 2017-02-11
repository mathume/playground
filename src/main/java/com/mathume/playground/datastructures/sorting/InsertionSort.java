package com.mathume.playground.datastructures.sorting;

/**
 * Created by sebastian on 11/02/17.
 */
public class InsertionSort implements IntSorter {
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int v = array[i];
            int j;
            for (j = i; (array[j - 1] > v) && j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[j] = v;
        }
    }
}
