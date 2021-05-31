package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
Given a string, print all of its permutations.
Below are the permutations of string ABC.
ABC ACB BAC BCA CBA CAB
 */
public class PermutationsOfString {

    public static ArrayList<String> printPermutations(String input, int begin, int end, ArrayList<String> results){
        if(begin == end){
            System.out.println(input);
            results.add(input);
        }
     else {
            for (int i = begin; i <= end; i++) {
                String s = swap(input, begin, i);
                printPermutations(s, begin + 1, end, results);
                //Getting back original string for next iteration of the loop to swap starting character with each other.
                s = swap(s, begin, i);
            }
        }
     return results;
    }

    public static HashSet<String> printUniquePermutations(String input, int begin, int end, HashSet<String> results){
        if(begin == end){
            if(!results.contains(input)){
                System.out.println(input);
                results.add(input);
            }
        }
        else {
            for (int i = begin; i <= end; i++) {
                String s = swap(input, begin, i);
                printUniquePermutations(s, begin + 1, end, results);
                //Getting back original string for next iteration of the loop to swap starting character with each other.
                s = swap(s, begin, i);
            }
        }
        return results;
    }

    public static String swap(String input, int start, int end){
        char[] characters = input.toCharArray();
        char swap = characters[start];
        characters[start] = characters[end];
        characters[end] = swap;
        return String.valueOf(characters);
    }

    public static void main(String... args){
        ArrayList<String> results = new ArrayList<>();
        String input = "ABCA";
        results = printPermutations(input,0,input.length()-1, results);

        HashSet<String> resultSet = new HashSet<>();
        resultSet = printUniquePermutations(input,0,input.length()-1, resultSet);

    }
}
