package com.mathume.playground.datastructures.storage;

/**
 * Created by sebastian on 11/02/17.
 */
public class BinaryTree<T> {
    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    Node<T> root;
}
