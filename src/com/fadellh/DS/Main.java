package com.fadellh.DS;

import com.fadellh.DS.AVLTree.AvlTree;
import com.fadellh.DS.BinaryTree.Tree;
import com.fadellh.DS.Heap.Heap;
import com.fadellh.DS.Heap.MaxHeap;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //==========================Binary Tree==========================================
        //==========================Binary Tree==========================================
        //==========================Binary Tree==========================================
//        var treeImp = new Tree();
//        treeImp.insert(10);
//        treeImp.insert(7);
//        treeImp.insert(12);
//        treeImp.insert(13);
//        treeImp.insert(8);
//        treeImp.insert(5);
//        treeImp.insert(2);
//        treeImp.insert(3);
//        treeImp.insert(1);
//        treeImp.insert(9);
//        treeImp.insert(14);
////        treeImp.traversePreOrder();
////        treeImp.traverseInOrder();
////        System.out.println(treeImp.isBinarySearchTree());
//        treeImp.distanceTree(2);
////        var treeImp2 = new Tree();
////        treeImp2.insert(10);
////        treeImp2.insert(7);
////        treeImp2.insert(12);
////        treeImp2.insert(13);
////        treeImp2.insert(8);
////        treeImp2.insert(5);
////        System.out.println(treeImp.equals(treeImp2));
////        treeImp.traversePreOrder();
////        treeImp.traverseInOrder();
////        treeImp.traversePostOrder();
//        System.out.println("Hello");

        //==========================AVLTree==========================================
        //==========================AVLTree==========================================
        //==========================AVLTree==========================================

//        var tree = new AvlTree();
//        tree.insert(10);
//        tree.insert(12);
//        tree.insert(5);
//        tree.insert(6);
//        tree.insert(7);
//        tree.insert(9);

        //==========================AVLTree==========================================
        //==========================AVLTree==========================================
        //==========================AVLTree==========================================


        // ==========================Heap==========================================
        // ==========================Heap==========================================

//        var heap = new Heap();
//
//        heap.insert(10);
//        heap.insert(5);
//        heap.insert(17);
//        heap.insert(4);
//        heap.insert(22);
//        heap.insert(1);
//       heap.print();
////       heap.remove();
//       heap.print();
        // ==========================Heap==========================================
        // ==========================Heap==========================================

        // ==========================MaxHeap==========================================
        // ==========================MaxHeap==========================================
        int [] numbers = {5,3,8,4,1,2};
        MaxHeap.heapify(numbers);
        System.out.println(Arrays.toString(numbers));

        // ==========================MaxHeap==========================================
        // ==========================MaxHeap==========================================



    }
}
