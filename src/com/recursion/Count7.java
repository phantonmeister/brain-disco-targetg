package recursion;
/*
Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops).
Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
 */
public class Count7 {
    public static void main(String... args){

        System.out.println(count7(717));
    }


    static int count7(int n){

        if(n == 7)
            return 1;
        if(n < 7)
            return 0;

        int first = n/10, second = n%10;

        if(second == 7)
            return 1+count7(first);
        else
            return count7(first);
    }
}
