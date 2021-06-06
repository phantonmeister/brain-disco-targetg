package sorting;

import java.util.Arrays;

// Linear time but uses O(n) extra space.

public class CountingSort {

    public static int[] countingSort(int[] input, int maxRange){
        //Creating an output array
        int[] output = new int[input.length];
        //Creating a temp array for all the integers
        int[] frequency = new int[maxRange+1];
        for(int i : input)
            //Updating the count of each occurence
            frequency[i]++;
        //Creating a cumulative count.
        for(int i = 1; i < frequency.length; i++){
            frequency[i] = frequency[i-1]+frequency[i];
        }
        for(int j = input.length-1; j >=0; j --){
            int temp = input[j];
            output[frequency[temp]-1] = temp;
            frequency[temp]--;
        }
        return output;
    }

    public static void main(String... args){
        int[] input = {2,1,0,2,0,3,5,5,1};
        int max = Arrays.stream(input).max().getAsInt();
        System.out.println(Arrays.toString(countingSort(input, max)));
    }
}
