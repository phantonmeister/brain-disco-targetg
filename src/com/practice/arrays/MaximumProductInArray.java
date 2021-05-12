package practice.arrays;

import java.util.Arrays;

/*
Find Max product in a given array.
{-10, -3, 5, 6, -2}
For the above array, the max product elements are  (-10, -3)(5, 6)

O(n) solution would involve keeping track of Max_1, Max_2 and Min_1 and Min_2 and then applying same comparision.

 */
public class MaximumProductInArray {

    /*
    nLog(n) solution.
     */
    public static void printMaxProductElements(int[] input){
        if(input.length <2)
            System.out.println(input[0]);
        else if (input.length == 2)
            System.out.println(input[0]*input[1]);

        Arrays.sort(input);

        if(input[0]*input[1] > input[input.length-1]*input[input.length-2])
            System.out.println("("+input[0]+","+input[1]+")");
        else
            System.out.println("("+input[input.length-2]+","+input[input.length-1]+")");


    }

    public static  void main(String... args){

        int[] input = {-10, -3, 5, 6, -2};
       printMaxProductElements(input);
    }
}
