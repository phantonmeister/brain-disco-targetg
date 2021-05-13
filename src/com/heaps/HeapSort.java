package com.practice.heaps;

public class HeapSort {

    //Uses Heapify to Maintain Heap property. After heapify, element at index 0 is the max or min based on Max or Min
    //heap.

   static void heapify(int[] unsortedInput, int size, int startIndex){

       int largest = startIndex;
       int leftChild = 2*startIndex+1;
       int rightChild = 2*startIndex+2;

       if(leftChild < size && unsortedInput[leftChild] > unsortedInput[largest])
           largest = leftChild;
       if(rightChild < size && unsortedInput[rightChild] > unsortedInput[largest])
           largest = rightChild;

       if(largest != startIndex){

           int swap = unsortedInput[startIndex];
           unsortedInput[startIndex] = unsortedInput[largest];
           unsortedInput[largest] = swap;

           heapify(unsortedInput,size,largest);
       }
   }

    static void buildHeap(int[] unsortedInput, int size) {
        int startIndex = size/2 -1 ;
        for(int i = startIndex; i >=0; i--) {
            heapify(unsortedInput, size, i);
        }
    }

    static void heapSort(int[] unsortedInput){

       buildHeap(unsortedInput, unsortedInput.length);
       int size = unsortedInput.length;

        while(size > 0){
           int swap = unsortedInput[0];
           unsortedInput[0] = unsortedInput[size-1];
           unsortedInput[size-1] = swap;
           size --;
           buildHeap(unsortedInput, size);
       }
    }

    public static void main(String... args ){
        int[] unsortedInput = new int[] {1,1,-1,2,3,4,5,7,67,23,45};
        heapSort(unsortedInput);

        for (int e : unsortedInput)
            System.out.println("Sorted Output is " + e);
    }
}
