package com.mathume.playground.datastructures;

/**
 * Created by sebastian on 9/02/17.
 */

/**
 * Implementation of object queue with unlimited capacity.
 */
public class Queue1 {

    private Entry first;
    private Entry last;

    /**
     * appends o as last element in the queue
     * @param o
     */
    public void put(Object o) {
        if(this.isEmpty()){
            this.first = new Entry(o);
            this.last = this.first;
        }else{
            this.last.setNext(new Entry(o));
            this.last = this.last.getNext();
        }
    }

    /**
     *
     * @return the first element of the queue
     */
    public Object pop() {
        if (!this.isEmpty()) {
            Object f = this.first.getEntry();
            this.first = this.first.getNext();
            return f;
        } else {
            throw new UnsupportedOperationException("Queue is empty.");
        }
    }

    private boolean isEmpty() {
        return this.first == null;
    }
}
