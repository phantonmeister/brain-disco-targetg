package com.practice.heaps;

import java.util.PriorityQueue;
import java.util.Scanner;

public class FindKthLargestInAStream {


    public static void main(String... args){

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->a-b);
        Scanner in = new Scanner(System.in);

        while(true){
                int x = in.nextInt();

                if(pq.size() < 3) // K = 3 here
                    pq.add(x);
                else {
                    if(pq.peek() < x)
                        pq.poll();
                        pq.add(x);
                    System.out.println("3rd Largest element is " +pq.peek());
                }
        }
    }
}
