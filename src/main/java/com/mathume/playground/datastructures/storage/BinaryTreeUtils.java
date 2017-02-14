package com.mathume.playground.datastructures.storage;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sebastian on 13/02/17.
 */
public class BinaryTreeUtils {
    public static BinaryTree<Integer> someBinarySearchTree(int depth){
        BinaryTree<Integer> t = new BinaryTree<Integer>();
        Node current = new Node<Integer>(depth);
        t.setRoot(current);
        for(int i=depth, j=depth+1; i>1; i--, j++){
            current.setLeft(new Node<Integer>(i-1));
            current.setRight(new Node<Integer>(j));
            current = current.getLeft();
        }
        return t;
    }

    public static boolean checkBinarySearchTree(BinaryTree<Integer> t){
        List<Integer> visited = new ArrayList<Integer>();
        try{
            checkBinarySearchTree(visited, t.getRoot());
            return true;
        }catch(IllegalArgumentException e){
            return false;
        }
    }

    private static void checkBinarySearchTree(List<Integer> track, Node<Integer> current) throws IllegalArgumentException{
        if(current != null){
            Integer value = current.getValue();
            Node<Integer> left = current.getLeft();
            Node<Integer> right = current.getRight();
            if((left != null && value < left.getValue())
                || (right != null && value > right.getValue())
                    || track.contains(value)){
                throw new IllegalArgumentException();
            }else{
                track.add(value);
                checkBinarySearchTree(track, left);
                checkBinarySearchTree(track, right);
            }
        }
    }
}
