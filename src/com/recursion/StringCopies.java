package recursion;
/*
Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere, possibly with overlapping. N will be non-negative.

strCopies("catcowcat", "cat", 2) → true
strCopies("catcowcat", "cow", 2) → false
strCopies("catcowcat", "cow", 1) → true

 */
public class StringCopies {
    public static int returnCount(String input, String subString, int count){
        if(input.length() < subString.length())
            return count;

        if(input.substring(0,subString.length()).equals(subString)){
            count = count+1;
           count = returnCount(input.substring(1),subString,count);
        }
        else
           count =  returnCount(input.substring(1),subString,count);
        return count;
    }
    public static boolean minCopiesExist(String input, String sub, int n){
        if(n <= countSubstrings(input,sub))
            return true;
        else
            return false;
    }

    public static int countSubstrings(String input, String subString){
        if(input.length()< subString.length())
            return 0;
        if(input.substring(0,subString.length()).equals(subString))
            return 1+countSubstrings(input.substring(1),subString);
        else
            return countSubstrings(input.substring(1),subString);
    }

    public static  void main(String... args){
        String input = "catcowcat";
        System.out.println(minCopiesExist("catcowcatblahcatcat","cat",4));

    }
}
