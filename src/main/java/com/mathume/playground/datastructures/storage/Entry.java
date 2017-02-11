package com.mathume.playground.datastructures.storage;

/**
 * Created by sebastian on 10/02/17.
 */
public class Entry {

    private Entry next;
    private Object content;

    public Entry(Object entry){
        this.content = entry;
    }

    public Entry getNext() {
        return next;
    }

    public void setNext(Entry next) {
        this.next = next;
    }

    public Object getContent() {
        return content;
    }

}
