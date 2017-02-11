package com.mathume.playground.datastructures;

import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sebastian on 11/02/17.
 */
public class Perm {
    public static void all(int[] array, int init, List<Integer[]> perms) {
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
