package recursion;

public class GeneratePowerSet {
    public static void printPowerSet(String input, int index, String current){
       int length = input.length();
       if(index == length){
           System.out.println(current);
           return;
       }
        printPowerSet(input, index + 1, current + input.charAt(index));
        printPowerSet(input, index + 1, current);
    }

    public static void main(String... args){
        String s = "abcd";
        printPowerSet(s,0,"");
    }
}
