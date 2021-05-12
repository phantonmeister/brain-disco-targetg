package recursion;

/*
Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them.

countHi2("ahixhi") → 1
countHi2("ahibhi") → 2
countHi2("xhixhi") → 0
 */
public class CountHi2 {

    public static int countHi2(String input){

        int length = input.length();
        if(length<3){
            if(input.equals("hi"))
                return 1;
                else
                    return 0;
        }
        if(input.charAt(length-3) != 'x' && input.substring(length-2,length).equals("hi"))
           return 1+countHi2(input.substring(0,length-1));
        return
                countHi2(input.substring(0,length-1));
    }

    public static void main(String... args){

        String input = "xhixhi";

        System.out.println(countHi2(input));
    }
}
