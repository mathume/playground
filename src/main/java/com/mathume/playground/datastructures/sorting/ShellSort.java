package com.mathume.playground.datastructures.sorting;

/**
 * Created by sebastian on 11/02/17.
 */
public class ShellSort implements IntSorter {
    public void sort(int[] array) {
        int step;
        for (step = 1; step <= array.length / 9; step = 3 * step + 1) {
        }// init step sequence

        for (; step > 0; step /= 3) {
            this.sort(array, step);
        }
    }

    private void sort(int[] array, int step) {
        for (int i = step; i < array.length; i++) {
            int v = array[i];
            int k;
            for (k = i; (k >= step) && (array[k - step] > v); k -= step) {
                array[k] = array[k - step];
            }
            array[k] = v;
        }
    }
}
