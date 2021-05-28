package recursion;

public class Factorial {

    public static int factorialRecursive(int input){
        if(input == 1)
            return 1;

        return input*factorialRecursive(input-1);
    }

    public static int factorialMemoization(int input){
        int[] cache = new int[input+1];
        cache[1] = 1;
        cache[0] = 0;

        for(int i = 2; i < input+1; i++ ){
            cache[i] = i*cache[i-1];
        }
        return cache[input];
    }

    public static void main(String... args){

        int input = 5;

        System.out.println(factorialRecursive(input));
        System.out.println(factorialMemoization(5));
    }
}
