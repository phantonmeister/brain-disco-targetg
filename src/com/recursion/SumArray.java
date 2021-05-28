package recursion;

/*
Return the sum of elements in array
 */
public class SumArray {
    public static int calculateSum(int[] input, int sum, int index){
        if(index == input.length)
            return sum;
        sum +=input[index];
        return calculateSum(input,sum,index+1);
    }

    public static int calculateSum_1(int[] input, int index){
        if(index == input.length)
            return 0;

        return input[index]+calculateSum_1(input,index+1);
    }

    public static void main(String... args){
        int[] input = {1,5,7,-2};
        System.out.println(calculateSum(input,0,0));
        System.out.println(calculateSum_1(input,0));
    }
}
