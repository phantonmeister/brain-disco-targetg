package dailycodingchallenge;

public class ProductArray {
    /*
    Given an array of integers, return a new array such that each element at index i of the new array is the product of
    all the numbers in the original array except the one at i.
    For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
     */

    public static int[] productArrayByDivision(int[] input){
        int arrayProduct = 1;
        for (int i : input)
            arrayProduct = arrayProduct*i;
        for (int i = 0; i < input.length; i++){
            input[i] = arrayProduct/input[i];
        }
        return input;
    }

    /*
      O(n^2)
     */
    public static int[] productArrayWithoutDivision(int[] input){
        int[] first = new int[input.length];
        int[] second = new int[input.length];

        int i = 0, j =input.length-1;
        for(int k =0; k < input.length; k++){
            int tmp = 1;
            while(i < k){
                tmp = tmp*input[k];
                i++;
            }
            first[k] = tmp;
            tmp = 1;
            while(j > k){
                tmp = tmp*input[j];
                j--;
            }
            second[k]=tmp;
        }
        for(int l =0; l < input.length; l++){
            input[l] = first[l]*second[l];
        }

        return input;
    }

    public static  void main(String... args){
        int[] input = {1,2,3,4,5};
        productArrayByDivision(input);
        for(int i : input)
            System.out.println(i);
    }
}
