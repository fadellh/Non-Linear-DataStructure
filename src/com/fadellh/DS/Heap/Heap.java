package com.fadellh.DS.Heap;

import java.util.Arrays;

public class Heap {
    private int[] items = new int[10];
    private int size;
    private int index;

    //30 //[20,10,15]
    //[10,5,17]
    //[17,5,10]
    //4,22//[17,5,10,4,22]

    public void insert(int value){
        if(isFull()){
            throw new IllegalStateException();
        }
        items[size++] = value;
        bubleUp();
    }

    public void remove(){
        if(size == 0){
            throw new IllegalStateException();
        }

        items[0] = items[--size];
//        size--;

        var index = 0;
        while(index<= size && !isValidParent(index)){
            var largerChildIndex = largerChildIndex(index);
            swap(index, largerChildIndex(index));
            index = largerChildIndex;
        }
    }






    private boolean hasLeftChild(int index){
        return leftChildIndex(index) <= size;
    }

    private boolean hasRightChild(int index){
        return rightChildIndex(index) <= size;
    }

    private int largerChildIndex(int index){
        if(!hasLeftChild(index))
            return index;
         if(!hasRightChild(index))
             return leftChildIndex(index);

        return leftChild(index) > rightChild(index) ? leftChildIndex(index) : rightChildIndex(index);
    }

    private boolean isValidParent(int index){
        if(!hasLeftChild(index))
            return true;

        var isValid = items[index] >= leftChild(index);

        if(!hasRightChild(index))
             isValid = isValid & items[index] >= rightChild(index);

        return isValid;
    }

    private int leftChild(int index){
        return items[leftChildIndex(index)];
    }

    private int rightChild(int index){
        return items[rightChildIndex(index)];
    }

    private int leftChildIndex(int index){
        return index * 2 + 1;
    }

    private int rightChildIndex(int index){
        return index * 2 + 2;
    }


    private boolean isFull(){
        return size == items.length;
    }

    private void bubleUp(){
        var idx = size - 1;
        while (idx > 0 && items[idx] > items[parent(idx)]){
            ///swap
            swap(idx, parent(idx));
            idx = parent(idx);
        }
    }

    private int parent(int index){
        return (index - 1) / 2;
    }

    private void swap(int first, int second){
        var temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }

    public void insertSelf(int num){
        if(index == 0){
            items[index++] = num;
            return;
        }

        var data = Math.floor(((index -1 )/2));
        var parentIndex = (int)data;

        if(num > items[parentIndex]) {
               //Swap
            var itemParent = items[parentIndex];
            items[parentIndex] = num;
            items[index] = itemParent;
        } else{
            items[index] = num;
        }
        index++;
        size++;


    }
    public void print(){
        System.out.println(Arrays.toString(items));
    }
}
