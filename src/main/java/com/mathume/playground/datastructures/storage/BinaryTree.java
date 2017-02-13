package com.mathume.playground.datastructures.storage;

import java.util.ArrayList;
import java.util.List;

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
