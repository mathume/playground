package com.mathume.playground.datastructures.storage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sebastian on 13/02/17.
 */
public class BinaryTreeUtils {

    public static boolean checkBinarySearchTree(BinaryTree<Integer> t) {
        List<Integer> visited = new ArrayList<Integer>();
        try {
            checkBinarySearchTree(visited, t.getRoot(), null);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    private static void checkBinarySearchTree(List<Integer> track, Node<Integer> current, Integer previous) throws IllegalArgumentException {
        if (current != null) {
            Integer value = current.getValue();
            Node<Integer> left = current.getLeft();
            Node<Integer> right = current.getRight();
            if ((left != null && value < left.getValue())
                    || (right != null && value > right.getValue())) {
                throw new IllegalArgumentException();
            } else {
                addChecked(track, value, previous);
                checkBinarySearchTree(track, left, value);
                checkBinarySearchTree(track, right, value);
            }
        }
    }

    private static void addChecked(List<Integer> l, Integer value, Integer previous) throws IllegalArgumentException {
        if (l != null && l.size() > 0) {
            Integer first = l.get(0);
            Integer last = l.get(l.size() - 1);
            if (value == first || value == last) {
                throw new IllegalArgumentException();
            }
            if (previous != null) {
                if ((value < first && previous > first)
                        || (value > last && previous < last)) {
                    throw new IllegalArgumentException();
                }
            }
        } else {
            addOrdered(l, value);
        }
    }

    private static void addOrdered(List<Integer> l, Integer value) {
        if (l.size() == 0) {
            l.add(value);
        } else {
            for (int i = 0; i < l.size(); i++) {
                if (value < l.get(i)) {
                    l.add(i, value);
                    break;
                }
                if (i == l.size() - 1) {
                    l.add(value);
                }
            }
        }
    }
}
