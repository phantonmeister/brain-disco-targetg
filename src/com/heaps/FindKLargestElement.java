package heaps;

import javafx.scene.layout.Priority;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class FindKLargestElement {
    /*
      Input:

arr = [7, 4, 6, 3, 9, 1]
k = 2

Output:

k’th largest array element is 7
     */

    static int findKthLargestElement(List<Integer> ints, int k){

        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)-> b-a);

        queue.addAll(ints);

        while(--k>0){
            queue.poll();
        }
        return queue.peek();
    }

    public static void main(String... args){

        List<Integer> ints = Arrays.asList(7,4,6,3,9,1);

        System.out.println(findKthLargestElement(ints,2));
    }
}
