package arrays;

import java.util.Arrays;

/*
Given an array of 0's, 1's and 2's, sort it in linear running time and constant space
Input: { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 }

Output:{ 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2 }
 */
public class Sort012ArrayInPlaceWithLinearRunningTime {

    public static int[] sortInLinearTime(int[] input, int pivot){
        int start = 0,mid =0;
        int end = input.length-1;

        while(mid <= end) {
            if (input[mid] < pivot) {
                swap(input, start, mid);
                ++start;
                ++mid;
            }
           else if (input[mid] > pivot) {
                swap(input, mid, end);
                --end;
            } else
                ++mid;
        }
        return input;
    }

    // Utility function to swap elements `A[i]` and `A[j]` in the array
    private static void swap(int[] A, int i, int j)
    {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public static void main(String... args){
        int[] input = { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };
        System.out.println(Arrays.toString(sortInLinearTime(input,1)));
    }
}
