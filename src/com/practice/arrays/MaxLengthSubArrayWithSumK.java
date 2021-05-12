package practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
Given an integer array, find the maximum length subarray having a given Sum K

Ex:- A[] = { 5, 6, -5, 5, 3, 5, 3, -2, 0 }
Sum = 8


Subarrays with sum 8 are

{ -5, 5, 3, 5 }
{ 3, 5 }
{ 5, 3 }

The longest subarray is { -5, 5, 3, 5 } having length 4
 */
public class MaxLengthSubArrayWithSumK {


    private static class  Pair<U,V> {
        U u;
        V v;

        private Pair(U a, V b){
            this.u = a;
            this.v = b;
        }

        private static <U, V> Pair<U,V> of(U a, V b) { return new Pair<U, V>(a,b);}
    }

    private static void printMaxSubArrayWithGivenSum(int[] input, int sumK){

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        //Initilaize initial result pair We will just update this if we find longest result
        Pair<Integer, Integer> resultpair = new Pair<>(-1,-1);

        map.put(0, new ArrayList<>(Arrays.asList(-1)));

        int sum =0;

        for (int i =0; i < input.length; i++){
            sum += input[i];
            int targetSum = sum - sumK;
            ArrayList<Integer> al = new ArrayList<>();
            if(map.containsKey(targetSum)){
                al = map.get(targetSum);
                for (int p : al){
                    if(i - p> (resultpair.v- resultpair.u)){
                        resultpair = new Pair<>(p, i-1);
                    }
                }
            }
            al.add(i);
            map.put(sum,al);
        }

        for(int i = resultpair.u; i <= resultpair.v; i ++){
            System.out.println(input[i]);
        }
    }
    public static void main(String... args){

        int[] input = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
        printMaxSubArrayWithGivenSum(input, 8);
    }
}
