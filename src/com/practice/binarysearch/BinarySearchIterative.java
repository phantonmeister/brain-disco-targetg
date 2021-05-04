package com.practice.binarysearch;

public class BinarySearchIterative {


    public static int findIndexOfElementInArray(int[] input, int x) {

        int high = input.length;
        int low = 0;
        int mid ;

        if(x < input[low] || x > input[high-1])
            return -1;
        while (low < high) {
            mid =  (low+high)/2;
            if(input[mid] == x )
                return mid;
            else if (input[mid] < x)
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }


    public static void main(String... args) {

        System.out.println("Element is at index: " +findIndexOfElementInArray(new int[] {1,2,3,6,9,10,15},100));

    }
}
