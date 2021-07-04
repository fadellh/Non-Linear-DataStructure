package com.fadellh.DS.AVLTree;

public class AvlTree {

    private class AVLNode {
        private int value;
        private int height;
        private AVLNode leftChild;
        private AVLNode rightChlid;

        public AVLNode(int value){
            this.value = value;
        }

        @Override
        public String toString(){
            return "Node= " + value;
        }
    }

    private AVLNode root;

    public void insert (int num) {
        root = insert(num,root);
    }


    private AVLNode insert(int num, AVLNode root){
        if(root == null){
            return new AVLNode(num);
        }
        if(num < root.value){
           root.leftChild = insert(num,root.leftChild);
        }else{
           root.rightChlid = insert(num, root.rightChlid);
        }

        root.height = Math.max(height(root.leftChild),height(root.rightChlid)) + 1;

        return root;
    }

    private int height (AVLNode node){
        return node == null ? -1 : node.height;
    }

}
