package com.mathume.playground.datastructures.storage;

/**
 * Created by sebastian on 11/02/17.
 */
public class Node<T> {

    private T value;
    private Node left;
    private Node right;

    public Node() { }

    public Node(T value){
        this.value = value;
    }

    public Node(Node<T> left, T value){
        this.value = value;
        this.left = left;
    }

    public Node(T value, Node<T> right){
        this.value = value;
        this.right = right;
    }

    public Node(Node<T> left, T value, Node<T> right){
        this.value = value;
        this.right = right;
        this.left = left;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
