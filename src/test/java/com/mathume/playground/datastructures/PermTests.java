package com.mathume.playground.datastructures;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by sebastian on 11/02/17.
 */
public class PermTests {
    @Test
    public void Correctness(){

        int[] array = new int[3];
        for(int i=0; i<array.length; i++) array[i] = i;

        List<Integer[]> perms = new ArrayList<Integer[]>();

        Perm.all(array, 0, perms);

        assertThat(perms.size(), is(equalTo(6)));
        for(Integer[] perm : perms){
            for(int i=0; i<perm.length; i++){
                for(int j=i+1; j<perm.length; j++){
                    assertThat(perm[i], is(not(equalTo(perm[j]))));
                }
            }
        }
    }
}
