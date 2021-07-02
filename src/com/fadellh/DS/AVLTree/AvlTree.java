package com.fadellh.DS.AVLTree;

import com.fadellh.DS.BinaryTree.Tree;

public class AvlTree {

    private class Node{
        private int value;
        private Node leftChild;
        private Node rightChlid;

        public Node(int value){
            this.value = value;
        }

        @Override
        public String toString(){
            return "Node= " + value;
        }
    }

    private Node root;

    public void insert (int num) {
        root = insert(num,root);
    }


    private Node insert(int num, Node root){
        if(root == null){
            return new Node(num);
        }

        if(num < root.value){
           root.leftChild = insert(num,root.leftChild);
        }else{
           root.rightChlid = insert(num, root.rightChlid);
        }
        return root;
    }



}
