package recursion;

public class Array11 {
    /*
    Given an array of ints, compute recursively the number of times that the value 11 appears in the array.
    We'll use the convention of considering only the part of the array that begins at the given index.
    In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.

array11({1, 2, 11}, 0) → 1
array11({11, 11}, 0) → 2
array11({1, 2, 3, 4}, 0) → 0
     */

    static int array11(int[] input, int index){

        if(index < 0 || index >= input.length)
            return 0;
        if(input[index] == 11)
            return 1+ array11(input, index+1);
        return array11(input, index+1);

    }


    public static void main(String... args){
        int[] input = {1,2,11};

        System.out.println(array11(input,0));
    }
}
