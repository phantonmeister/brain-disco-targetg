package string;

import java.util.ArrayList;
import java.util.HashSet;

/*
Input : str = "aabb"
Output :
abba
baab

 */
public class PrintPalindromicPermutationsOfString {

    //Used HashSet to remove the duplicates.
    public static HashSet<String> printPalindromicPermutations(String input, int begin, int end, HashSet<String> results){
        if(begin == end){
            if(isPalindrome(input)) {
                results.add(input);
            }
        }
        else {
            for (int i = begin; i <= end; i++) {
                String s = swap(input, begin, i);
                printPalindromicPermutations(s, begin + 1, end, results);
                //Getting back original string for next iteration of the loop to swap starting character with each other.
                s = swap(s, begin, i);
            }
        }
        return results;
    }

    public static String swap(String input, int begin, int end){
        char[] characters = input.toCharArray();
        char swap = characters[begin];
        characters[begin] = characters[end];
        characters[end] = swap;
        return String.valueOf(characters);
    }

    public static boolean isPalindrome(String inString){
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = inString.length() - 1;
        // While there are characters to compare
        while (i < j) {
            // If there is a mismatch
            if (inString.charAt(i) != inString.charAt(j))
                return false;
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }

    public static void main(String... args){
        String input = "malayalam";
        HashSet<String> results = new HashSet<>();
        results = printPalindromicPermutations(input,0,input.length()-1, results);
        if(results.size() == 0)
            System.out.println(-1);
        else
            results.stream().forEach(System.out::println);
    }
}
