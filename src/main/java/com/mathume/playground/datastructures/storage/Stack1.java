package com.mathume.playground.datastructures.storage;

/**
 * Created by sebastian on 10/02/17.
 */

/**
 * Implements an object stack with unlimited capacity.
 */
public class Stack1 {

    private Entry current;

    /**
     *
     * @return the object on top of stack
     */
    public Object pop(){
        if(!isEmpty()){
            Object f = this.current.getContent();
            this.current = this.current.getNext();
            return f;
        }else{
            throw new UnsupportedOperationException("Stack is empty.");
        }
    }

    /**
     * puts o on top of stack
     * @param o
     */
    public void put(Object o){
        Entry e = new Entry(o);
        e.setNext(this.current);
        this.current = e;
    }

    public boolean isEmpty() {
        return this.current == null;
    }
}
