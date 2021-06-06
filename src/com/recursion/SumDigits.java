package recursion;
/*
sumDigits(126) → 9
sumDigits(49) → 13
sumDigits(12) → 3

 */
public class SumDigits {
    public static int sumdigits(int num){
        if(num == 0)
            return 0;
        return num%10+sumdigits(num/10);
    }
    public static void main(String... args){
        int num = 126;
        System.out.println(sumdigits(num));
    }
}
