package com.practice.heaps;

import java.util.PriorityQueue;

public class ConnectNRopesWithMinimalCost {
    /*
    Given n ropes of different lengths, connect them into a single rope with minimum cost. Assume that the cost to
    connect two ropes is the same as the sum of their lengths.
    Ex :-
    Input:  [5, 4, 2, 8]

Output: The minimum cost is 36

[5, 4, 2, 8] –> First, connect ropes of lengths 4 and 2 that will cost 6.
[5, 6, 8]    –> Next, connect ropes of lengths 5 and 6 that will cost 11.
[11, 8]      –> Finally, connect the remaining two ropes that will cost 19.

Therefore, the total cost for connecting all ropes is 6 + 11 + 19 = 36.
     */

    static int returnMinimumCost(int[] input){

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->a-b);
        int cost =0;

        for(int i : input){
            pq.add(i);
        }

        while (pq.size() >=2){
            int result = pq.poll()+ pq.poll();
            pq.add(result);
            cost+=result;
        }
        return cost;
    }
    public static void main(String... args){

        int[] input =  {5,4,2,8};

        System.out.println(returnMinimumCost(input));
    }
}
