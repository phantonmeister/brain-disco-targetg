package com.practice.binarysearch;

public class BinarySearchRecursion {

    public static int binarySearchRecursive(int[] input, int x, int low, int high){

        if(low == high) {
            if(input[low]==x) {
                return low;
            }
            else return -1;
            }
            else {
                int mid = (low+high)/2;
                if(input[mid]==x)
                    return mid;
                else if(input[mid] < x)
                {
                    low = mid+1;
                   return binarySearchRecursive(input,x,low,high);
                }
                else
                    high = mid-1;
               return binarySearchRecursive(input,x,low,high);
            }
        }


    public static void main(String... args) {
        int[] input = new int[]{2,5,8,10,34,56};
        int low = 0, high = input.length;
        System.out.println("Element is at index: "+binarySearchRecursive(input,56,low, high));
    }
}
