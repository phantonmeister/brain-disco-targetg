package recursion;

import java.util.Arrays;

public class PrintPermutationsofArray {

    public static void printArrayCombinations(int[] input, int start, int end){

        if(start ==  end)
            System.out.println(Arrays.toString(input));
        else{
            for(int i = start; i <=end; i++){
                int[] s = swap(input,start,i);
                printArrayCombinations(s,start+1,end);
                s= swap(s,start,i);
            }
        }
    }

    public static int[] swap (int[] inout, int begin, int end){
        int temp = inout[end];
        inout[end] = inout[begin];
        inout[begin]= temp;
        return inout;
    }
    public static void main(String... args){
        int[] input = {0,1,2};

        printArrayCombinations(input, 0, input.length-1);

    }
}
