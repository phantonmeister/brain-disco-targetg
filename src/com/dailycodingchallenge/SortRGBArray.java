package dailycodingchallenge;

import java.util.Arrays;

/*
Given an array of strictly the characters 'R', 'G', and 'B', segregate the values of the array so that all the Rs come first, the Gs come second, and the Bs come last.
You can only swap elements of the array.

Do this in linear time and in-place.

For example, given the array ['G', 'B', 'R', 'R', 'B', 'R', 'G'], it should become ['R', 'R', 'R', 'G', 'G', 'B', 'B'].
 */
public class SortRGBArray {

    public static char[] sortRGB(char[] input, char pivot){
        int start = 0; int mid = 0; int end = input.length-1;
        while (mid <= end){
            if(input[mid] < pivot){
                swap(input, mid, end);
                end--;
            }
            else if(input[mid] > pivot){
                swap(input, start,mid);
                start++;
                mid++;
            }
            else
                mid++;
        }
        return input;
    }

    public static void swap(char[] input, int i, int j){
        char temp = input[j];
        input[j] =  input[i];
        input[i] = temp;
    }

    public static void main(String... args){
        char[] input = {'G', 'B', 'R', 'R', 'B', 'R', 'G'};
        System.out.println(Arrays.toString(sortRGB(input,'G')));
    }
}
