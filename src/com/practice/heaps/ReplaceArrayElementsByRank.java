package com.practice.heaps;

import java.util.PriorityQueue;

/*
Given an array of distinct integers, replace each array element by its corresponding rank.
Ex :- Input:  { 10, 8, 15, 12, 6, 20, 1 }

Output: { 4, 3, 6, 5, 2, 7, 1 }
 */
public class ReplaceArrayElementsByRank {

    static class Pair<U, V>{
        public final U first;
        public final V second;

        private Pair(U first, V second){
            this.first = first;
            this.second = second;
        }

        public static <U,V> Pair<U, V> of(U a, V b){
            return new Pair<>(a,b);
        }
    }

    public static void transform(int[] input){

        int highestRank = input.length;

        PriorityQueue<Pair<Integer,Integer>> pq = new PriorityQueue<>((a,b)-> b.first-a.first);

        for(int i =0; i < input.length; i++)
            pq.add(new Pair<>(input[i], i));

        while(!pq.isEmpty()){
            // take the next maximum element from the heap and replace its value
            // in the input array with its corresponding rank
            input[pq.poll().second] = highestRank;
            --highestRank;
        }

    }

    public static void main(String... args) {

        int[] input = {10,8,15,12,6,20,1};

        transform(input);

       for(int e : input)
           System.out.println(e);
    }
}
