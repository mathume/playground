package com.mathume.playground.datastructures.storage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sebastian on 11/02/17.
 */
public class PreorderTraversal<T> {
    private BinaryTree<T> t;
    private Node<T> current;

    public PreorderTraversal(BinaryTree<T> tree){
        this.t = tree;
    }

    public List<T> ordered(){
        List<T> pre = new ArrayList<T>();
        this.ordered(pre, this.t.getRoot());
        return pre;
    }

    private void ordered(List<T> pre, Node<T> current){
        if(current != null){
            pre.add(current.getValue());
            this.ordered(pre, current.getLeft());
            this.ordered(pre, current.getRight());
        }
    }
}
