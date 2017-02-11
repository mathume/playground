package com.mathume.playground.datastructures.storage;

import com.mathume.playground.datastructures.storage.Queue1;
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

    @Test
    public void fifo(){
        Object first = "first";
        Object last = "last";
        Queue1 q = getFullQueue(first, last, 3);
        assertThat(q.pop(), is(equalTo(first)));
        q.pop();
        assertThat(q.pop(), is(equalTo(last)));
    }

    private Queue1 getFullQueue(Object first, Object last, int capacity) {
        Queue1 q = new Queue1();
        q.put(first);
        for(int i=1; i<capacity-1; i++){
            q.put(null);
        }
        q.put(last);
        return q;
    }
}
