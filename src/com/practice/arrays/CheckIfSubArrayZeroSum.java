package practice.arrays;

import java.util.HashSet;
import java.util.Set;

public class CheckIfSubArrayZeroSum {

    /*
    Given an array, check if a sub array of zero sum exists.
    Ex:- Input:  { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }

Output: Subarray with zero-sum exists

The subarrays with a sum of 0 are:

{ 3, 4, -7 }
{ 4, -7, 3 }
{ -7, 3, 1, 3 }
{ 3, 1, -4 }
{ 3, 1, 3, 1, -4, -2, -2 }
{ 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
     */

    static boolean isSubArrayWithZeroSumExists(int[] input){
        Set<Integer> subSum = new HashSet<>();

        //Add 0 to the set initially to account for the case where array starts with 0.
        subSum.add(0);
        int sum = 0;

        for(int i : input){
            sum += i;
            //If the sum is seen before in set or sum is zero, that means there is a subarray with zero sum
            if(subSum.contains(sum))
                return true;
            subSum.add(sum);
        }
        return false;
    }

    public static void main(String... args){
        int [] input = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };

        System.out.println("Does the sub array with zero sum exist? "+isSubArrayWithZeroSumExists(input));
    }

}
