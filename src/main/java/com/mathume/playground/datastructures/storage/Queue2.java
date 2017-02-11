package com.mathume.playground.datastructures.storage;

/**
 * Created by sebastian on 11/02/17.
 */
public class Queue2 implements Queue {
    Stack1 in;
    Stack1 out;

    public Queue2(){
        this.in = new Stack1();
        this.out = new Stack1();
    }

    public void enqueue(Object o){
        this.in.put(o);
    }

    public Object dequeue(){
        if(this.out.isEmpty()){
            while(!this.in.isEmpty()){
                this.out.put(this.in.pop());
            }
        }

        return this.out.pop();
    }
}
