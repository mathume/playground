package com.mathume.playground.datastructures.sorting;

/**
 * Created by sebastian on 11/02/17.
 */
public class QuickSort implements IntSorter {
    public void sort(int[] array) {
        this.sort(0, array.length-1, array);
    }

    private void sort(int l, int r, int[] array){
        int m;
        if(r > l){
            m = array[r];
            int i=l-1;
            int j=r;
            while(true){
                while(array[++i] < m) { }
                while(array[--j] > m) { }

                if(i>=j){
                    break;
                }
                int t = array[i];
                array[i] = array[j];
                array[j] = t;
            }
            array[r] = array[i];
            array[i] = m;
            this.sort(l, i-1, array);
            this.sort(i+1, r, array);
        }
    }
}
