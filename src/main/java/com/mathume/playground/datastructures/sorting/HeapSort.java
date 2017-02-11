package com.mathume.playground.datastructures.sorting;

/**
 * Created by sebastian on 11/02/17.
 */
public class HeapSort implements IntSorter {
    public void sort(int[] array) {
        for(int k=array.length/2; k > 0;){
            this.adjustHeap(array.length, array, --k);
        }

        for(int n=array.length; --n > 0;){
            int t = array[0];
            array[0] = array[n];
            array[n] = t;

            this.adjustHeap(n, array, 0);
        }
    }

    private void adjustHeap(int n, int[] array, int k){
        int kk = k;
        int v = array[k];
        while(kk < n/2){
            int j = 2*kk+1;
            if( (j < n-1) && (array[j] < array[j+1])){
                j++;
            }

            if(v >= array[j]){
                break;
            }

            array[kk] = array[j];
            kk = j;
        }
        array[kk] = v;
    }
}
