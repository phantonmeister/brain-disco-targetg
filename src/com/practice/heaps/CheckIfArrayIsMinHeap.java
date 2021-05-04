package com.practice.heaps;

public class CheckIfArrayIsMinHeap {
    /*
    Given an array, check if it is Min Heap.
    Inout 1 :- {2,3,4,5,10,15}
    Inout 2 :- {2,10,4,5,3,15}
     */

    //Recursive solution
    static boolean returnIfArrayIsMinHeap(int[] input, int i){
        boolean isMinHeap = true;
        boolean isLeftMinHeap =true;
        boolean isRightMinHeap =true;

        if(input.length == 0)
            return true;

        //if the element is leaf node return true.
        if(2*i+2 > input.length)
            return true;

        //Recursively check if left is minheap
        boolean left = (input[i] <= input[2*i+1] && returnIfArrayIsMinHeap(input, 2*i+1));

        boolean right = (2*i+2 == input.length) || (input[i] <= input[2*i+2] && returnIfArrayIsMinHeap(input,2*i+2));

        return left && right;
    }


    static boolean iterativeSolution(int[] input){

        for(int i = 0; i<= (input.length-2)/2; i++){
           if(input[i] > input[2*i+1] || (2*i+2 != input.length && input[i] > input[2*i+2]))
               return false;
        }
        return true;
    }

    public static void main(String... args) {

        int [] input_1 = new int[] {2,3,4,5,10,15,12,11};
        int[] input_2 = new int[] {2,10,4,5,3,15};

        System.out.println(iterativeSolution(input_1));

    }
}
