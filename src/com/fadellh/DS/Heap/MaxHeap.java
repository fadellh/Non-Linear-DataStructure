package com.fadellh.DS.Heap;

public class MaxHeap {
    public static void  heapify (int[]array) {
        for(var i = 0;i< array.length;i++){
            heapify(array, i);
        }
    }

    //{5,3,8,4,1,2}

    private static void heapify(int[]array,int index){
        var largenIndex = index;

        var leftIdx = index * 2 + 1;
        if(leftIdx < array.length && array[leftIdx] > array[largenIndex]){
            largenIndex = leftIdx;
        }

        var rightIdx = index * 2 + 2;
        if(rightIdx < array.length && array[rightIdx] > array[largenIndex]){
            largenIndex = rightIdx;
        }

        if(index == largenIndex)
            return;

        swap(array,index, largenIndex);
        heapify(array, largenIndex);
    }

    public static void swap(int[] array, int first, int second){
        var temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}
