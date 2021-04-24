package com.fadellh.DS.BinaryTree;

public class Tree {
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

    public void inserta(int number){
        var node = new Node(number);

        if(root == null) {
            root = node;
            return;
        };

        var current = root;

        if (root.leftChild != null || root.rightChlid != null){
            if(current.value > number){
                current.leftChild = node;
                node.value = number;
                current = current.leftChild;
            }else {
                current.rightChlid = node;
                node.value = number;
                current = current.rightChlid;
            }
        }

        while (current.leftChild != null || current.rightChlid != null){
            if(current.value > number){
                current.leftChild = node;
                node.value = number;
                current = current.leftChild;
            }else {
                current.rightChlid = node;
                node.value = number;
                current = current.rightChlid;
            }
        }

    }

    public void insert(int number){
        var node = new Node(number);

        if(root == null){
            root = node;
            return;
        }
        var current = root;
        while (true){
            if(current.value > number){
                if(current.leftChild == null){
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            }else {
                if(current.rightChlid == null){
                    current.rightChlid = node;
                    break;
                }
                current = current.rightChlid;
            }
        }
    }

    public boolean find(int number){
        var current = root;
        while (current != null){
            if(current.value > number){
                current = current.leftChild;
            }else if(current.value < number){
                current = current.rightChlid;
            }else{
                return true;
            }
        }
        return false;
    }

    public void traversePreOrder(){
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root){
        if(root == null) return;
        System.out.println(root);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChlid);
    }

    public void traverseInOrder(){
        traverseInOrder(root);
    }

    private void traverseInOrder(Node root){
        if(root == null) {
            return;
        }
        traverseInOrder(root.leftChild);
        System.out.println(root);
        traverseInOrder(root.rightChlid);
    }

    public void traversePostOrder(){
        traversePostOrder(root);
    }

    private void traversePostOrder(Node root){
        if(root == null){
            return;
        }
        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChlid);
        System.out.println(root);
    }

}
