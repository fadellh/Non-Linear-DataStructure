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
        System.out.println(treeImp.find(5));
        System.out.println(treeImp.find(6));
//        treeImp.traversePreOrder();
//        treeImp.traverseInOrder();
        treeImp.traversePostOrder();
        System.out.println("Hello");

    }
}
