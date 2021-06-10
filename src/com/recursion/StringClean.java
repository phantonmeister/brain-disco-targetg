package recursion;
/*
Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. So "yyzzza" yields "yza".

stringClean("yyzzza") → "yza"
stringClean("abbbcdd") → "abcd"
stringClean("Hello") → "Helo"
 */
public class StringClean {

    public static String cleanString(String input){
        if(input.equals("") || input.length() <2)
            return input;

        if(input.charAt(0) == input.charAt(1))
            return cleanString(input.substring(1));
        else
            return input.charAt(0)+cleanString(input.substring(1));
    }
    public static void main(String... args){
        String input = "abbbcdd";
        System.out.println(cleanString(input));
    }
}
