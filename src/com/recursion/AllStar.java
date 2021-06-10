package recursion;
/*
Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".

allStar("hello") → "h*e*l*l*o"
allStar("abc") → "a*b*c"
allStar("ab") → "a*b"

 */
public class AllStar {

    public static String returnAllStar(String input){
        if(input.equals("") || input.length()==1)
            return input;
        return input.charAt(0)+"*"+returnAllStar(input.substring(1));
    }
    public static void main(String... args){
        String input = "hello";
        System.out.println(returnAllStar(input));
    }
}
