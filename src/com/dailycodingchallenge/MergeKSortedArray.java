package dailycodingchallenge;

import java.util.PriorityQueue;

public class MergeKSortedArray {


    private static class PQNode implements Comparable<PQNode>{
        int arrayValue;
        int arrayNumber;
        int arrayIndex;

        public  PQNode(int arrayNumber, int arrayValue, int arrayIndex){
            this.arrayIndex =arrayIndex;
            this.arrayValue = arrayValue;
            this.arrayNumber = arrayNumber;
        }

        @Override
        public int compareTo(PQNode o) {
            return Integer.compare(arrayValue,o.arrayValue);
        }
    }

    public static int[] mergeKSortedArrays(int[][] input, int size, int k){

        int[] result = new int[size];
        PriorityQueue<PQNode> minHeap = new PriorityQueue<>(k);
        for(int i = 0; i<input.length; i++)
            minHeap.add(new PQNode(i, input[i][0], 0));

        int i =0;
        while(!minHeap.isEmpty()){
           PQNode node = minHeap.poll();
            result[i] = node.arrayValue;
            int newindex = node.arrayIndex+1;
            if(newindex < input[node.arrayNumber].length)
                minHeap.add(new PQNode(node.arrayNumber,input[node.arrayNumber][newindex], newindex));
            i++;
        }
        return result;
    }
    public static void main(String... args){

        int[][] input = new int[][] {{1,3,5,7},
                                     {2,4,6,8},
                                     {0,9,10,11}};

        int[] result = mergeKSortedArrays(input, input.length* input[0].length, input.length);

        for(int i :result)
            System.out.println(i);
    }
}
