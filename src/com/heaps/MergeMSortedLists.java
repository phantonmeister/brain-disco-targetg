package com.practice.heaps;

import java.util.PriorityQueue;

public class MergeMSortedLists {
    /*
    Give M Sorted Lists of variable length, print them efficiently in sorted order.
    Example:-
    Input:  4 sorted lists of variable length

[ 10, 20, 30, 40 ]
[ 15, 25, 35 ]
[ 27, 29, 37, 48, 93 ]
[ 32, 33 ]

Output:

10 15 20 25 27 29 30 32 33 35 37 40 48 93
     */
    private static class PQNode implements Comparable<PQNode>{
        int arrayNumber, arrayIndex, arrayValue;

        public PQNode(int arrayNumber, int arrayIndex, int arrayValue){
            this. arrayIndex =arrayIndex;
            this.arrayNumber = arrayNumber;
            this.arrayValue = arrayValue;
        }

        @Override
        public int compareTo(PQNode o) {
            return Integer.compare(arrayValue, o.arrayValue);
        }
    }

    public static int[] mergeMSortedLists(int[][] arrays){
        int size = 0;
        for(int i =0; i< arrays.length;i++)
        {
            size+=arrays[i].length;
        }
        int[] mergedOutput = new int[size];

        PriorityQueue<PQNode> queue = new PriorityQueue<PQNode>(arrays.length);
        for(int i = 0 ; i<arrays.length; i++){
            queue.add(new PQNode(i,0, arrays[i][0]));
        }

        for(int j =0 ; !queue.isEmpty(); j++){
            PQNode node = queue.poll();
            mergedOutput[j] = node.arrayValue;
            int  index = node.arrayIndex+1;
            if(index < arrays[node.arrayNumber].length)
                queue.add(new PQNode(node.arrayNumber,index, arrays[node.arrayNumber][index]));
        }
        return  mergedOutput;
    }

    public static void main(String... args){

        int[][] inputArrays = {{10,20,30,40},
                               {15,25,35},
                               {27,29,37,48,93},
                               {32,33}};
        int [] output = mergeMSortedLists(inputArrays);

        for (int e : output)
            System.out.println(e);
    }
}
