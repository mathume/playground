package com.mathume.playground.datastructures.sorting;

/**
 * Created by sebastian on 11/02/17.
 */
public class SelectionSort implements IntSorter {
    public void sort(int[] array) {
        for(int i=0; i<array.length-1; i++){
            int min = i;
            for(int k=i+1; k<array.length; k++){
                if(array[k] < array[min]){
                    min = k;
                }
            }

            int t = array[min];
            array[min] = array[i];
            array[i] = t;
        }
    }
}
