package com.practice.heaps;

import javafx.scene.layout.Priority;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class FindKthSmallestElement {


    public static int findKthSmallestElement(List<Integer> input, int k){

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>((a,b)->a-b);

        queue.addAll(input);
        while(--k>0){
            queue.poll();
        }
        return queue.poll();
    }

    public static void main(String... args){

        //K = 3
        List<Integer> inout = Arrays.asList(7,4,6,3,9,1);

        System.out.println(findKthSmallestElement(inout,3));
    }
}
