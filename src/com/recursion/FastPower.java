package recursion;
/*
This is the program for calculating fast power with minimal multiplications.
Compare this with the regular powerN. Compare the number of multiplications it does.
 */
public class FastPower {
    public static int multiplicationCount = 0;
    public static int fastPower(int n, int base){
        if(base == 0) {
            System.out.println(multiplicationCount);
            return 1;
        }
        else if (base == 1){
            System.out.println(multiplicationCount);
            return n;
        }
        else {
            if(base % 2 == 0) {
                multiplicationCount++;
                return fastPower(n * n, base / 2);
            }
            else{
                multiplicationCount++;
                return n * fastPower(n, base);
            }
        }
    }

    public static void main(String... args){
        int n = 3;
        System.out.println(fastPower(8,8));
    }
}
