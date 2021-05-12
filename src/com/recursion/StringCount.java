package recursion;
/*
Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string,
without the sub strings overlapping.

strCount("catcowcat", "cat") → 2
strCount("catcowcat", "cow") → 1
strCount("catcowcat", "dog") → 0
 */
public class StringCount {

    public static int countString(String input, String searchString){
        int lengthSearch = searchString.length();
        int sourceLengt = input.length();

        if(lengthSearch > sourceLengt)
            return 0;

        if(searchString.equals(input.substring(0, lengthSearch)))
            return 1+countString(input.substring(lengthSearch), searchString);
        return countString(input.substring(1), searchString);
    }

    public static void main(String... args){

        System.out.println(countString("catcowcat","cow"));
    }
}
