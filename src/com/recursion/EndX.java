package recursion;
/*
Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.

endX("xxre") → "rexx"
endX("xxhixx") → "hixxxx"
endX("xhixhix") → "hihixxx"
 */
public class EndX {

    public static String endX(String input){
        if(input.length() ==0 || input.equals(""))
            return input;
        if(input.charAt(0) == 'x')
            return endX(input.substring(1))+'x';
        else
            return input.charAt(0)+endX(input.substring(1));
    }

    public static void main(String... args){
        String input = "xxre";
        System.out.println(endX(input));
    }
}
