package practice.arrays;

import java.util.*;

/*
Input:  { 4, 2, -3, -1, 0, 4 }

Subarrays with zero-sum are

{ -3, -1, 0, 4 }
{ 0 }


Input:  { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }

Subarrays with zero-sum are

{ 3, 4, -7 }
{ 4, -7, 3 }
{ -7, 3, 1, 3 }
{ 3, 1, -4 }
{ 3, 1, 3, 1, -4, -2, -2 }
{ 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
 */
public class PrintSubArrays0Sum {

    private static class Pair<U, V> {

        U u;
        V v;

        private Pair(U u, V v) {
            this.u = u;
            this.v = v;
        }

        public static <U, V> Pair<U, V> of(U a, V b) {
            return new Pair<>(a, b);
        }
    }

    static List<Pair<Integer,Integer>> returnSubArraysWithZeroSum(int[] input) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Pair<Integer,Integer>> output = new ArrayList<>();
        int sum = 0;
        for(int i =0; i< input.length; i++){
            sum += input[i];
            if(sum == 0)
                output.add(new Pair<Integer,Integer>(0,i));
            ArrayList<Integer> al = new ArrayList<>();
            if(map.containsKey(sum)){
                al = map.get(sum);
                for (int it = 0; it < al.size(); it++)
                {
                    output.add(new Pair<Integer,Integer>(al.get(it) + 1, i));
                }
            }
            al.add(i);
            map.put(sum,al);
        }
        return output;
    }

    public static void main(String... args) {
        int[] input = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };

        List<Pair<Integer, Integer>> out = returnSubArraysWithZeroSum(input);
        if (out.size() == 0)
            System.out.println("No subarray exists");
        for (int i = 0; i < out.size(); i++)
        {
            Pair<Integer,Integer> p = out.get(i);
            System.out.println("Subarray found from Index "
                    + p.u + " to " + p.v);
        }
    }
}
