package sorting;

import java.util.Arrays;

/*
Implementation of counting sort when there are negative numbers.
Add the min element to the rest of the elements, Now every element is positive.
use counting sort and when adding elements to the output array, remove the min element to get back original elements.
 */
public class CountingSortNegativeNumbers {

    public static int[] countSortWithNegativeNumbers(int[] input){

        int size = input.length;
        int[] output = new int[size];
        int min = Math.abs(Arrays.stream(input).min().getAsInt());
        for(int i =0; i < input.length; i++)
            input[i] = input[i]+min;
        int maxRange = Arrays.stream(input).max().getAsInt();
        int[] cumulativeArray = new int[maxRange+1];
        //Updating counts of each occurence
        for(int j = 0; j < input.length; j++){
            cumulativeArray[input[j]]++;
        }
        for(int k =1; k < cumulativeArray.length;k++)
            cumulativeArray[k] = cumulativeArray[k-1]+cumulativeArray[k];
        for(int i = input.length-1; i >=0; i--){
            output[cumulativeArray[input[i]] -1] = input[i]-min;
        }
        return output;
    }

    public static void main(String... args){
        int[] input = {-5,-10,0,-3,8,5,-1,10};
        System.out.println(Arrays.toString(countSortWithNegativeNumbers(input)));
    }
}
