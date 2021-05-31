package recursion;

/*
Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".

parenBit("xyz(abc)123") → "(abc)"
parenBit("x(hello)") → "(hello)"
parenBit("(xy)1") → "(xy)"
 */
public class ParenBit {

    public static void returnParenString(String input){
        if("".equals(input))
            System.out.println(-1);
        else if(input.charAt(0) == '(') {
            if (input.charAt(input.length() - 1) == ')')
                System.out.println(input.substring(0, input.length()));
            else
                returnParenString(input.substring(0, input.length() - 1));
        }
        else
            returnParenString(input.substring(1));
    }

    public static void main(String... args){
        String input = "xyz(abc)123";
        returnParenString(input);
    }
}
