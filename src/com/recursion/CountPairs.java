package recursion;
/*
We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a pair.
 Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number of pairs in the given string.

countPairs("axa") → 1
countPairs("axax") → 2
countPairs("axbx") → 1

 */
public class CountPairs {

    public static int countPairs(String input){
        if(input.equals("") || input.length() < 3)
            return 0;

        if(input.charAt(0) == input.charAt(2))
            return 1+countPairs(input.substring(1));
        else
            return countPairs(input.substring(1));
    }
    public static void main(String... args){
        String input = "axax";
        System.out.println(countPairs(input));
    }
}
