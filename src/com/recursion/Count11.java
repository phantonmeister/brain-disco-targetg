package recursion;
/*
Count the number of times 11 appears in a string. Don't count the overlapping 11's.
 */
public class Count11 {
    static int count11(String input){
        if(input.length() < 2)
            return 0;

        if(input.substring(0,2).equals("11"))
            return 1+count11(input.substring(2));
        else
            return count11(input.substring(1));
    }


    public static void main(String... args){
        String input = "11abc11";

        System.out.println(count11(input));
    }
}
