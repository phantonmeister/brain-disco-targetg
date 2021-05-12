package practice.arrays;

import java.util.Arrays;

public class PairWithSumInArray {
    /*
    Given an unsorted Integer array, find a pair with the given sum in it.

    Ex:-
arr = [8, 7, 2, 5, 3, 1]
sum = 10

Output:
Pair found (8, 2)
or
Pair found (7, 3)

Input:

arr = [5, 2, 6, 8, 1, 9]
sum = 12

Output: Pair not found
Naive solution is to use compare each element with others and add to see if it is given targer. Running time in n^2.
For O(n) solution, sort the array. Take two pointers.
     */

   private static class Pair<U,V>{
        public U a;
        public V b;

        private Pair(U a, V b) {
            this.a = a;
            this.b = b;
        }

        public static  <U,V> Pair<U, V> of(U a, V b){
            return new Pair<>(a,b);
        }
    }

    public static Pair<Integer, Integer> findPair(int[] input, int sum){

        Arrays.sort(input);

        int i = 0, j= input.length-1;

        while (i< j){
            if(input[i]+input[j] == sum)
                return new Pair<>(input[i],input[j]);
            else if (input[i]+input[j]> sum)
                j--;
            else
                i++;
        }
        return new Pair<>(-1,-1);
    }


    public static void main(String... args){

        int[] input = {8,7,2,5,3,1};
        Pair<Integer,Integer> result = findPair(input, 10);

        System.out.println(result.a+","+result.b);

    }
}
