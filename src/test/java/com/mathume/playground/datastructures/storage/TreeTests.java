package com.mathume.playground.datastructures.storage;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by sebastian on 11/02/17.
 */
public class TreeTests {
    @Test
    public void create_root(){
        BinaryTree t = new BinaryTree();
        t.setRoot(new Node());
    }

    @Test
    public void create_two_children_level_1(){
        BinaryTree t = new BinaryTree();
        t.setRoot(new Node());
        t.getRoot().setLeft(new Node());
        t.getRoot().setRight(new Node());
    }

    @Test
    public void traverse_preorder(){
        BinaryTree<Integer> t = new BinaryTree<Integer>();
        Node<Integer> left = new Node(1);
        Node<Integer> right = new Node(2);
        Node<Integer> root = new Node(left, 0, right);
        t.setRoot(root);
        PreorderTraversal trav = new PreorderTraversal(t);
        List<Integer> preordered = trav.ordered();
        assertThat(preordered.size(), is(equalTo(3)));
        for(int i=0; i<preordered.size(); i++){
            assertThat(preordered.get(i), is(equalTo(i)));
        }
    }

    @Test
    public void traverse_postorder(){
        BinaryTree<Integer> t = new BinaryTree<Integer>();
        Node<Integer> left = new Node(1);
        Node<Integer> right = new Node(2);
        Node<Integer> root = new Node(left, 0, right);
        t.setRoot(root);
        PostorderTraversal trav = new PostorderTraversal(t);
        List<Integer> ordered = trav.ordered();
        assertThat(ordered.size(), is(equalTo(3)));
        assertThat(ordered.get(0), is(equalTo(1)));
        assertThat(ordered.get(1), is(equalTo(2)));
        assertThat(ordered.get(2), is(equalTo(0)));
    }

    @Test
    public void traverse_inorder(){
        BinaryTree<Integer> t = new BinaryTree<Integer>();
        Node<Integer> left = new Node(1);
        Node<Integer> right = new Node(2);
        Node<Integer> root = new Node(left, 0, right);
        t.setRoot(root);
        InorderTraversal trav = new InorderTraversal(t);
        List<Integer> ordered = trav.ordered();
        assertThat(ordered.size(), is(equalTo(3)));
        assertThat(ordered.get(0), is(equalTo(1)));
        assertThat(ordered.get(1), is(equalTo(0)));
        assertThat(ordered.get(2), is(equalTo(2)));
    }

    @Test
    public void traverse_levelOrder(){
        BinaryTree<Integer> t = new BinaryTree<Integer>();
        Node<Integer> left = new Node(1);
        Node<Integer> right = new Node(2);
        Node<Integer> root = new Node(left, 0, right);
        t.setRoot(root);
        LevelOrderTraversal trav = new LevelOrderTraversal(t);
        List<Integer> ordered = trav.ordered();
        assertThat(ordered.size(), is(equalTo(3)));
        assertThat(ordered.get(0), is(equalTo(0)));
        assertThat(ordered.get(1), is(equalTo(1)));
        assertThat(ordered.get(2), is(equalTo(2)));
    }

    @Test
    public void isBinarySearchTree(){
        BinaryTree<Integer> t = new BinaryTree<Integer>();
        Node<Integer> root = new Node<Integer>(6);
        root.setRight(new Node<Integer>(8));
        root.setLeft(new Node<Integer>(3));
        root.getLeft().setLeft(new Node<Integer>(1));
        root.getLeft().setRight(new Node<Integer>(4));
        t.setRoot(root);
        /*
        6
        |   \
        3    8
        | \
        1  4
         */
        assertThat(BinaryTreeUtils.checkBinarySearchTree(t), is(true));
    }

    @Test
    public void isNotBinarySearchTree_1(){
        BinaryTree<Integer> t = new BinaryTree<Integer>();
        Node<Integer> root = new Node<Integer>(6);
        root.setRight(new Node<Integer>(8));
        root.setLeft(new Node<Integer>(3));
        root.getLeft().setLeft(new Node<Integer>(1));
        root.getLeft().setRight(new Node<Integer>(7));
        t.setRoot(root);
        /* 7 must not be greater than 6
        6
        |   \
        3    8
        | \
        1  7
         */
        assertThat(BinaryTreeUtils.checkBinarySearchTree(t), is(false));
    }

    @Test
    public void isNotBinarySearchTree_2(){
        BinaryTree<Integer> t = new BinaryTree<Integer>();
        Node<Integer> root = new Node<Integer>(6);
        root.setRight(new Node<Integer>(8));
        root.setLeft(new Node<Integer>(3));
        root.getLeft().setLeft(new Node<Integer>(1));
        root.getRight().setLeft(new Node<Integer>(5));
        t.setRoot(root);
        /* 5 must not be less than 6
        6
        |   \
        3    8
        |    |
        1    5
         */
        assertThat(BinaryTreeUtils.checkBinarySearchTree(t), is(false));
    }

    @Test
    public void isNotBinarySearchTree_3(){
        BinaryTree<Integer> t = new BinaryTree<Integer>();
        Node<Integer> root = new Node<Integer>(6);
        root.setRight(new Node<Integer>(8));
        root.setLeft(new Node<Integer>(3));
        root.getLeft().setLeft(new Node<Integer>(1));
        root.getRight().setLeft(new Node<Integer>(6));
        t.setRoot(root);
        /* 6 must not be repeated
        6
        |   \
        3    8
        |    |
        1    6
         */
        assertThat(BinaryTreeUtils.checkBinarySearchTree(t), is(false));
    }

    @Test
    public void isNotBinarySearchTree_4(){
        BinaryTree<Integer> t = new BinaryTree<Integer>();
        Node<Integer> root = new Node<Integer>(6);
        root.setRight(new Node<Integer>(8));
        root.setLeft(new Node<Integer>(3));
        root.getLeft().setLeft(new Node<Integer>(1));
        root.getLeft().setRight(new Node<Integer>(6));
        t.setRoot(root);
        /* 6 must not be repeated
        6
        |   \
        3    8
        | \
        1  6
         */
        assertThat(BinaryTreeUtils.checkBinarySearchTree(t), is(false));
    }
}
