package com.mathume.playground.datastructures.sorting;

/**
 * Created by sebastian on 11/02/17.
 */
public class BubbleSorter implements IntSorter {
    public void sort(int[] array) {
        for(int i=array.length-1; i > 0; i--){
            for(int k=0; k < i; k++){
                if(array[k] > array[k+1]){
                    int t = array[k];
                    array[k] = array[k+1];
                    array[k+1] = t;
                }
            }
        }
    }
}
