package com.mathume.playground.datastructures;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by sebastian on 9/02/17.
 */
public class QueueTests {
    @Test
    public void puts_first_element(){
        Queue1 q = new Queue1();
        Object o = new Object();
        q.put(o);
        assertThat(q.pop(), is(equalTo(o)));
    }
}
