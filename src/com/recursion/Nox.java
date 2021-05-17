package recursion;

/*
Given a string, compute recursively a new string where all the 'x' chars have been removed.

noX("xaxb") → "ab"
noX("abc") → "abc"
noX("xx") →
 */
public class Nox {

    public static String nox(String input){

        if(input.length() ==0 || "".equals(input))
            return input;

        if(input.charAt(0) == 'x')
            return nox(input.substring(1,input.length()));
        return input.charAt(0) +nox(input.substring(1,input.length()));

    }

    public static void main(String... args){
        System.out.println(nox("axcvsxdfx"));
    }
}
