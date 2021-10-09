package permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a set [1,2,3] print all subsets.
 */
public class PrintCombinationsOfSet {

    public static void main(String... args){
        int[] input = {1,2,3};
        printAllSubsets(input,0, "");
    }

    static void printAllSubsets(int[] input, int size, String result){
        if(size == input.length){
            System.out.println(result);
            return;
        }
        printAllSubsets(input, size+1,result);
        printAllSubsets(input,size+1, result+input[size] );
    }
}
