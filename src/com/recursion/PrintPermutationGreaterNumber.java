package recursion;

/*
Given a number N, our task is to print those permutations of integer N which are greater than N.
Examples:

Input: N = 534
Output: 543
Input: N = 324
Output: 342, 423, 432

 */
public class PrintPermutationGreaterNumber {

    public static void printPermuationGreater(int[] input, int begin, int end, int original){
        if(begin == end){
           printIfGreater(input,original);
        }
        else{
            for(int i =begin; i <= end; i++){
                int[] s = swap(input, begin, i);
                printPermuationGreater(s, begin+1,end,original);
                s = swap(s, begin, i);
            }
        }
    }

    //First we are finding all perumutations and then checking if a given Permuation is greater than original.
    // Optimization could be done by NextPermutation method.
    public static void printIfGreater(int[] a, int original){
        StringBuilder temp = new StringBuilder();
        for(int i : a){
            temp.append(String.valueOf(i));
        }
        if(Integer.parseInt(temp.toString()) > original)
            System.out.println(temp);
    }

    public static int[] swap(int[] in, int begin, int end){
        int temp = in[begin];
        in[begin] = in[end];
        in[end] = temp;
        return in;
    }

    public static void main(String... args){
        int input = 534;
        int temp = input;
        int count = 0;
        while(temp > 0){
            count++;
            temp /=10;
        }
        int[] digits = new int[count];

        while(input > 0){
            digits[count-- -1] = input%10;
            input = input/10;
        }
        printPermuationGreater(digits,0,digits.length-1,534);

    }
}
