package com.mathume.playground.datastructures.storage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sebastian on 11/02/17.
 */
public class PostorderTraversal<T> {
    private BinaryTree<T> t;
    private Node<T> current;

    public PostorderTraversal(BinaryTree<T> tree){
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
            this.ordered(post, current.getRight());
            post.add(current.getValue());
        }
    }
}
