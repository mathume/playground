package com.mathume.playground.datastructures.storage;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by sebastian on 9/02/17.
 */
public class QueueTests {

    @Test
    public void Queue1_test_one_element(){
        Queue q = new Queue1();
        test_one_element_in_and_out(q);
    }

    @Test
    public void Queue1_fifo(){
        Queue q = new Queue1();
        test_order(q);
    }

    @Test
    public void Queue2_test_one_element(){
        Queue q = new Queue2();
        test_one_element_in_and_out(q);
    }

    @Test
    public void Queue2_fifo(){
        Queue q = new Queue2();
        test_order(q);
    }

    private void test_one_element_in_and_out(Queue q) {
        Object o = new Object();
        q.enqueue(o);
        assertThat(q.dequeue(), is(equalTo(o)));
    }

    private void test_order(Queue q) {
        Object first = "first";
        Object last = "last";
        fillQueue(first, last, 3, q);
        assertThat(q.dequeue(), is(equalTo(first)));
        q.dequeue();
        assertThat(q.dequeue(), is(equalTo(last)));
    }

    private void fillQueue(Object first, Object last, int capacity, Queue q) {
        q.enqueue(first);
        for(int i=1; i<capacity-1; i++){
            q.enqueue(null);
        }
        q.enqueue(last);
    }
}
