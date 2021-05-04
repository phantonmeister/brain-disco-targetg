package com.practice.heaps;

import java.util.Arrays;
import java.util.PriorityQueue;

/*
Give M sorted lists of variable length, efficiently compute the smallest range, including atleast one element from each
list.
Example :-
Input:  4 sorted lists of variable length

[ 3, 6, 8, 10, 15 ]
[ 1, 5, 12 ]
[ 4, 8, 15, 16 ]
[ 2, 6 ]

Output:

The minimum range is 4–6


Input:  4 sorted lists of variable length

[ 2, 3, 4, 8, 10, 15 ]
[ 1, 5, 12 ]
[ 7, 8, 15, 16 ]
[ 3, 6 ]

Output:

The minimum range is 4–7
 */
public class SmallestRangeWithAtleastOneELement {

    private static class RangeKeys {
        private int lowest;
        private int highest;

        public  RangeKeys(int a, int b){
            this.lowest = a;
            this.highest =b;
        }
    }

    private static class PQNode implements Comparable<PQNode>{
        int arrayNumber, arrayIndex, arrayValue;

        PQNode(int arrayNumber, int arrayIndex, int arrayValue){
            this.arrayNumber = arrayNumber;
            this.arrayIndex = arrayIndex;
            this.arrayValue = arrayValue;
        }

        @Override
        public int compareTo(PQNode o) {
            return  Integer.compare(arrayValue, o.arrayValue);
        }
    }

    public static RangeKeys findSmallestRangeContainingSingleElement(int[][] inoutList){

        PriorityQueue<PQNode> queue = new PriorityQueue<PQNode>();
        RangeKeys rangeKeys =  new RangeKeys(0, Integer.MAX_VALUE);

        int high = Integer.MIN_VALUE;

        for(int i = 0; i < inoutList.length; i++){
           PQNode nodepq =  new PQNode(i,0,inoutList[i][0]);
            high = Integer.max(high, nodepq.arrayValue);
            queue.add(nodepq);
        }

        for(int i = 0; !queue.isEmpty(); i++) {
            PQNode node = queue.poll();

            int low = node.arrayValue;

            int newIndex = node.arrayIndex + 1;

            if (newIndex < inoutList[node.arrayNumber].length) {
                if(high - low < rangeKeys.highest - rangeKeys.lowest){
                    rangeKeys.highest = high;
                    rangeKeys.lowest = low;
                }
                PQNode newToMinHeap = new PQNode(node.arrayNumber, newIndex, inoutList[node.arrayNumber][newIndex]);
                if (newToMinHeap.arrayValue > high)
                    high =  newToMinHeap.arrayValue;
                queue.add(new PQNode(node.arrayNumber, newIndex, inoutList[node.arrayNumber][newIndex]));
            } else
                return rangeKeys;
        }
        return rangeKeys;
    }
    public static void main(String... args) {

        int[][] inoutList = {{ 2, 3, 4, 8, 10, 15},
                            {1,5,12},
                            {7,8,15,16},
                            {2,6}};

        RangeKeys rangeKey = findSmallestRangeContainingSingleElement(inoutList);
        System.out.println("Range is " + rangeKey.lowest + " - " + rangeKey.highest);
    }
}
