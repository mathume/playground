package com.mathume.playground.datastructures.storage;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by sebastian on 15/02/17.
 */
public class ListTests {
    @Test
    public void TestPrepend(){
        List<Integer> l = new ArrayList<Integer>();
        l.add(2);
        l.add(0,1);
        assertThat(l.size(), is(2));
        assertThat(l.get(0), is(1));
    }
}
