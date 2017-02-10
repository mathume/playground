package com.mathume.playground.datastructures;

/**
 * Created by sebastian on 10/02/17.
 */
public class Entry {

    public Entry getNext() {
        return next;
    }

    public void setNext(Entry next) {
        this.next = next;
    }

    public Object getEntry() {
        return entry;
    }

    public void setEntry(Object entry) {
        this.entry = entry;
    }

    private Entry next;
    private Object entry;

    public Entry(Object entry){
        this.entry = entry;
    }
}
