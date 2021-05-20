package dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/*
The Longest Increasing Subsequence (LIS) problem is to find the length of the longest subsequence of a given sequence such
that all elements of the subsequence are sorted in increasing order. For example, the length of LIS for
{10, 22, 9, 33, 21, 50, 41, 60, 80} is 6 and LIS is {10, 22, 33, 50, 60, 80}.



 */
public class LongestIncreasingSubSequence {
    public static int findLIS_R(int[] input) {

        int length = input.length;
        int max = Integer.MIN_VALUE;
        int[] dpCache = new int[length];
        dpCache[0]=1;

        for (int i =1; i < length; i++) {
            for (int j =0; j < i; j++){
                if(input[i]> input[j] && dpCache[j] > dpCache[i])
                    dpCache[i] = dpCache[j];
            }
            dpCache[i]++;
        }
        for(int k: dpCache ){
            if(max < k)
                max = k;
        }
        return max;
    }

    public static int LIS(int[] A)
    {
        // array to store subproblem solution. `L[i]` stores the length
        // of the longest increasing subsequence that ends with `A[i]`
        int[] L = new int[A.length];

        // the longest increasing subsequence ending at `A[0]` has length 1
        L[0] = 1;

        // start from the second array element
        for (int i = 1; i < A.length; i++)
        {
            // do for each element in subarray `A[0…i-1]`
            for (int j = 0; j < i; j++)
            {
                // find the longest increasing subsequence that ends with `A[j]`
                // where `A[j]` is less than the current element `A[i]`
                if (A[j] < A[i] && L[j] > L[i]) {
                    L[i] = L[j];
                }
            }
            // include `A[i]` in LIS
            L[i]++;
        }

        // return longest increasing subsequence (having maximum length)
        return Arrays.stream(L).max().getAsInt();
    }

    // Iterative function to find the longest increasing subsequence
    // of a given array
    public static void findLIS(int[] arr)
    {
        // `LIS[i]` stores the longest increasing subsequence of subarray
        // `arr[0…i]` that ends with `arr[i]`
        List<List<Integer>> LIS = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            LIS.add(new ArrayList<>());
        }

        // `LIS[0]` denotes the longest increasing subsequence ending at `arr[0]`
        LIS.get(0).add(arr[0]);

        // start from the second array element
        for (int i = 1; i < arr.length; i++)
        {
            // do for each element in subarray `arr[0…i-1]`
            for (int j = 0; j < i; j++)
            {
                // find the longest increasing subsequence that ends with `arr[j]`
                // where `arr[j]` is less than the current element `arr[i]`

                if (arr[j] < arr[i] && LIS.get(j).size() > LIS.get(i).size()) {
                    LIS.set(i, new ArrayList<>(LIS.get(j)));
                }
            }

            // include `arr[i]` in `LIS[i]`
            LIS.get(i).add(arr[i]);
        }

        // uncomment the following code to print contents of `LIS`
        /*for (int i = 0; i < arr.length; i++) {
            System.out.println("LIS[" + i + "] — " + LIS.get(i));
        }*/

        // `j` will store an index of LIS
        int j = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (LIS.get(j).size() < LIS.get(i).size()) {
                j = i;
            }
        }

        // print LIS
        System.out.print(LIS.get(j));
    }

    public static void main(String... args){
        int max = Integer.MIN_VALUE;
        int[] input = {10, 22, 9, 33, 21, 50, 40, 41, 60, 80};

        //System.out.println("Length of LIS is "+LIS(input));
        findLIS(input);
    }
}
