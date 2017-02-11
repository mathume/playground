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
}
