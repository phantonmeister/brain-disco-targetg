package com.practice.heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class SortAKSortedArray {
    /*
    Given a K sorted array that is almost sorted such that each of the n elements maybe misplaced by no more than k positions
    from the correct sorted order. Find a space and time efficient algorithm to sort the array.

    Example :- Input:

arr = [1, 4, 5, 2, 3, 7, 8, 6, 10, 9]
k = 2

Output:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
     */

    /*
    From all the possible elements at 0th position, we will take the minimum, 1 in this case.
    Then we strike out 1 as it’s placed at the correct position. Now for 1st position,
    the minimum element of all possible elements is 2 (remember that 1 is not there). And so on. This makes the array sorted.
     */
    static void sortKSortedArray(int[] unsorted, int k){

        List<Integer> unsortedList =  Arrays.asList(1,4,5,2,3,7,8,6,10,9);

        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)->a-b);

        /*
        Min heap it is. As seen above the maximum elements that can come at any position is k+1 for any index.
        So initially our heap needs to have first k+1 elements. The first min extracted will be the first element of sorted array.
        Then the next element will be inserted and the second minimum is extracted and so on. Since the insertion
        in a heap is logk and after removing the min element, heapify is also logk, where k is the number of elements
        in the heap. For all the n elements in array and k elements in heap, the time complexity is O(nlogk) and the space complexity is O(k) as the heap’s size is k elements.
         */
        queue.addAll(unsortedList.subList(0,k+1));

        for(int i = 0; i < unsorted.length; i++){
            unsorted[i] = queue.poll();
            if(k+1+i < unsorted.length)
                queue.add(unsorted[k+1+i]);
        }
        for(int e : unsorted)
            System.out.println(e);
    }


    public static void main(String... args){

        int [] unsorted = {1,4,5,2,3,7,8,6,10,9};
        sortKSortedArray(unsorted,2);
    }
}
