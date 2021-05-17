package recursion;

public class BunnyEarsH {

    public static int calculateBunnyEars(int n) {

        if(n==0)
            return 0;
            return 2+calculateBunnyEars(n-1);
    }

    public static void main(String... args){
        System.out.println(calculateBunnyEars(2));
    }
}
