package com.mathume.playground.datastructures.storage;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sebastian on 13/02/17.
 */
public class BinaryTreeUtils {

    public static boolean checkBinarySearchTree(BinaryTree<Integer> t) {
        List<Integer> visited = new ArrayList<Integer>();
        try {
            checkBinarySearchTree(visited, t.getRoot());
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    private static void checkBinarySearchTree(List<Integer> track, Node<Integer> current) throws IllegalArgumentException {
        if (current != null) {
            Integer value = current.getValue();
            Node<Integer> left = current.getLeft();
            Node<Integer> right = current.getRight();
            if ((left != null && value < left.getValue())
                    || (right != null && value > right.getValue())) {
                throw new IllegalArgumentException();
            } else {
                addOrdered(track, value);
                checkBinarySearchTree(track, left);
                checkBinarySearchTree(track, right);
            }
        }
    }

    private static void addOrdered(List<Integer> l, Integer value) throws IllegalArgumentException {
        if (l != null && l.size() > 0) {
            Integer first = l.get(0);
            Integer last = l.get(l.size() - 1);
            if (value == first || value == last) {
                throw new IllegalArgumentException();
            }
            if (value < first) {
                l.add(0, value);
            }
        } else {
            l.add(value);
        }
    }
}
