package recursion;

/*
Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((    ()))".
nestParen("(())") → true
nestParen("((()))") → true
nestParen("(((x))") → false
 */
public class NestParenthesis {
    public static boolean isNestingParenthesis(String input){
        if(input.length() == 0)
            return true;
        return ((input.charAt(0) == '(' && input.charAt(input.length()-1) == ')') && isNestingParenthesis(input.substring(1,input.length()-1)));
    }
    public static void main(String... args){
        String input = "((()))";
        System.out.println(isNestingParenthesis(input));
    }
}
