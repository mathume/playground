package com.mathume.playground.datastructures;

import org.apache.commons.lang.ArrayUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sebastian on 11/02/17.
 */
public class Perm {

    private Perm() { }

    /**
     * Creates all permutations of array
     * @param array
     * @return list of all permutations
     */
    public static List<Integer[]> all(int[] array){
        List<Integer[]> perms = new ArrayList<Integer[]>();
        all(array, 0, perms);
        return perms;
    }

    /**
     * O(n*n!): cn - cost of storing array of n elements, n! - number of permutations
     * @param array the array with elements to be permuted
     * @param init helper variable
     * @param perms storage for produced permutation
     */
    private static void all(int[] array, int init, List<Integer[]> perms) {
        if(init < array.length){
            int s = array[init];

            for(int j=init; j<array.length; j++){
                array[init] = array[j];
                array[j] = s;

                all(array, init+1, perms);

                array[j] = array[init];
            }
            array[init] = s;
        }else{
            int[] copy = new int[array.length];
            System.arraycopy(array, 0, copy, 0, array.length);
            perms.add(ArrayUtils.toObject(copy));
        }
    }
}
