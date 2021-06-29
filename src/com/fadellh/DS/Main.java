package com.fadellh.DS;

import com.fadellh.DS.BinaryTree.Tree;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //==========================BInary Tree==========================================
        //==========================BInary Tree==========================================
        //==========================BInary Tree==========================================
        var treeImp = new Tree();
        treeImp.insert(10);
        treeImp.insert(7);
        treeImp.insert(12);
        treeImp.insert(13);
        treeImp.insert(8);
        treeImp.insert(5);
//        treeImp.traversePreOrder();
//        treeImp.traverseInOrder();
        System.out.println(treeImp.isBinarySearchTree());

//        var treeImp2 = new Tree();
//        treeImp2.insert(10);
//        treeImp2.insert(7);
//        treeImp2.insert(12);
//        treeImp2.insert(13);
//        treeImp2.insert(8);
//        treeImp2.insert(5);
//        System.out.println(treeImp.equals(treeImp2));
//        treeImp.traversePreOrder();
//        treeImp.traverseInOrder();
//        treeImp.traversePostOrder();
        System.out.println("Hello");

    }
}
