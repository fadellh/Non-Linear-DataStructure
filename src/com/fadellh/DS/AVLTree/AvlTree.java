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

        setHeight(root);

       return balance(root);

    }

    private AVLNode balance(AVLNode node) {
        var balanceFactor = balanceFactor(node);
        if(balanceFactor > 1){ //Detecting heavy kemana.
            if((balanceFactor(root.leftChild))<0){
             root.leftChild =  leftRotate(root.leftChild);
            }
           return rightRotate(root);
        }
        else if(balanceFactor < -1){
            if((balanceFactor(root.rightChlid)) > 0){
              root.rightChlid =  rightRotate(root.rightChlid);
            }
         return  leftRotate(root);
        }

        return root;
    }


    private AVLNode leftRotate(AVLNode root){

        var newRoot = root.rightChlid;
        root.rightChlid = newRoot.leftChild;
        newRoot.leftChild = root;

        setHeight(root);
        setHeight(newRoot);

        return newRoot;
    }

    private void setHeight(AVLNode node){
        node.height = Math.max(height(node.leftChild),height(node.rightChlid)) +1;
    }

    private AVLNode rightRotate(AVLNode root){
        var newRoot = root.rightChlid;
        root.leftChild = newRoot.rightChlid;
        newRoot.rightChlid = root;

        setHeight(root);
        setHeight(newRoot);

        return newRoot;
    }

    private int height (AVLNode node){
        return node == null ? -1 : node.height;
    }

    private int balanceFactor (AVLNode node){
      return node == null ? 0: height(node.leftChild) - height(node.rightChlid);
    }


}
