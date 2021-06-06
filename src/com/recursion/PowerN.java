package recursion;
/*
Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
powerN(3, 1) → 3
powerN(3, 2) → 9
powerN(3, 3) → 27
 */
public class PowerN {
    public static int multiplicationsCount =0;
    public static int returnPower(int base, int raised){
        if(raised == 0){
            System.out.println(multiplicationsCount);
            return 1;
        }
        multiplicationsCount++;
        return base*returnPower(base,raised-1);
    }

    public static void main(String... args){
        System.out.println(returnPower(8,8));
    }
}
