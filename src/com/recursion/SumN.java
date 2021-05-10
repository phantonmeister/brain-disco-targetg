package recursion;

public class SumN {

    public static int  SumN(int n){

        if(n == 1)
            return 1;
        return n*SumN(n-1);
    }

    public static void main(String... args){
        System.out.println(SumN(5));
    }
}
