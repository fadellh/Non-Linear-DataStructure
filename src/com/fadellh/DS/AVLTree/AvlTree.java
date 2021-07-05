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

        balance(root);


        return root;
    }

    private void balance(AVLNode node) {
        var balanceFactor = balanceFactor(node);
        if(balanceFactor > 1){ //Detecting heavy kemana.
            if((balanceFactor(root.leftChild))<0){
                System.out.println("Left Rotate " + node.leftChild.value);
            }
            System.out.println("Right Rotate " + node.value);
        }
        else if(balanceFactor < -1){
            if((balanceFactor(root.rightChlid)) > 0){
                System.out.println("Right Rotate " + node.rightChlid.value);
            }
            System.out.println("Left Rotate " + node.value);
        }
    }


    private void leftRotate(){
        System.out.println(root.value + " is Left Heavy");
    }


    private void rightRotate(){
        System.out.println(root.value + " is right heavy");
    }

    private int height (AVLNode node){
        return node == null ? -1 : node.height;
    }

    private int balanceFactor (AVLNode node){
      return node == null ? 0: height(node.leftChild) - height(node.rightChlid);
    }


}
