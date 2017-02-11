package com.mathume.playground.datastructures.storage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sebastian on 11/02/17.
 */
public class InorderTraversal<T> {
    private BinaryTree<T> t;
    private Node<T> current;

    public InorderTraversal(BinaryTree<T> tree){
        this.t = tree;
    }

    public List<T> ordered(){
        List<T> post = new ArrayList<T>();
        this.ordered(post, this.t.getRoot());
        return post;
    }

    private void ordered(List<T> post, Node<T> current){
        if(current != null){
            this.ordered(post, current.getLeft());
            post.add(current.getValue());
            this.ordered(post, current.getRight());
        }
    }
}
