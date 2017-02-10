package com.mathume.playground.datastructures;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by sebastian on 10/02/17.
 */
public class StackTests {

    @Test
    public void puts_first_element(){
        Stack1 q = new Stack1();
        Object o = new Object();
        q.put(o);
        assertThat(q.pop(), is(equalTo(o)));
    }

    @Test
    public void lifo(){
        Object first = "first";
        Object last = "last";
        Stack1 q = getFullStack(first, last, 3);
        assertThat(q.pop(), is(equalTo(last)));
        q.pop();
        assertThat(q.pop(), is(equalTo(first)));
    }

    private Stack1 getFullStack(Object first, Object last, int capacity) {
        Stack1 q = new Stack1();
        q.put(first);
        for(int i=1; i<capacity-1; i++){
            q.put(null);
        }
        q.put(last);
        return q;
    }
}
