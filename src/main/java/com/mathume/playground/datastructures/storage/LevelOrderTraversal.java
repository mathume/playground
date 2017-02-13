package com.mathume.playground.datastructures.storage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sebastian on 13/02/17.
 */
public class LevelOrderTraversal<T> {
    BinaryTree<T> tree;

    public LevelOrderTraversal(BinaryTree<T> tree){
        this.tree = tree;
    }

    public List<T> ordered() {
        List<T> lo = new ArrayList<T>();
        Queue q = new Queue1();
        this.ordered(lo, q, this.tree.getRoot());
        return lo;
    }

    private void ordered(List<T> lo, Queue q, Node<T> current) {
        q.enqueue(current);
        while(!q.isEmpty()){
            current = (Node<T>)q.dequeue();
            lo.add(current.getValue());
            if(current.getLeft() != null){
                q.enqueue(current.getLeft());
            }
            if(current.getRight() != null){
                q.enqueue(current.getRight());
            }
        }
    }
}
