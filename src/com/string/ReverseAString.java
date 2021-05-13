package string;

public class ReverseAString {


    public static void reverseAStringOption1(String input){

        if ((null == input) || (input.length() == 0)) {
            System.out.println("Reversed String is : " +input);
        }
        else {
            char[] inputCharArray = input.toCharArray();
            StringBuilder reverseBuilder = new StringBuilder(inputCharArray.length);

            for (int i = inputCharArray.length-1; i >= 0; i--) {
                reverseBuilder.append(inputCharArray[i]);
            }
            System.out.println(reverseBuilder.toString());
        }

    }

    public static void reverseAStringOption2(String input){
        int length = input.length();
        if ((null == input) || (input.length() == 0)) {
            System.out.println("Reversed String is : " +input);
        }
        else {
            char[] inputCharArray = input.toCharArray();
            for (int i = 0; i < inputCharArray.length/2; i++) {
                final char c = inputCharArray[i];
                inputCharArray[i] = inputCharArray[(length-i)-1];
                inputCharArray[(length-i)-1] = c;
            }
            System.out.println(new String(inputCharArray));
        }
    }

    public static void main(String... args) {
        reverseAStringOption2("Tests is a 123 *77687 ");
    }
}
