package recursion;
/*
countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1
 */
public class CountHi {

    public static int countHi(String s){
        if(s.length()<2)
            return 0;
        if(s.length() == 2 && "hi".equals(s))
            return 1;
        if("hi".equals(s.substring(0,2)))
            return 1+countHi(s.substring(1));
        else return countHi(s.substring(1));
    }
    public static void main(String... args){

        System.out.println(countHi("hixhihihiih"));

    }
}
