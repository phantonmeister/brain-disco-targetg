package recursion;
/*
Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10.
array220({1, 2, 20}, 0) → true
array220({3, 30}, 0) → true
array220({3}, 0) → false
 */
public class Array220 {

    public static boolean doesTimesTenExists(int[] input, int index){
        if(index+1 >= input.length)
            return false;

        return (input[index+1] == input[index]*10)|| doesTimesTenExists(input,index+1);

    }
    public static void main(String... args){
        int [] input = {1,2,2,5,0,20,7};

        System.out.println(doesTimesTenExists(input,0));
    }
}
