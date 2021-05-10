package recursion;
/*

Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
 */
public class CountX {
    public static void main(String... args) {

        System.out.println(countX("xhixhix"));
    }


    static int countX(String n) {

        if (n.length() == 1) {
            if (n.equals("x"))
                return 1;
            else
                return 0;
        }
        if(n.length() == 0)
            return  0;

        if (n.charAt(n.length() - 1) == 'x')
          return  1 + countX(n.substring(0, (n.length() - 1)));
        else
           return countX(n.substring(0, n.length() - 1));
    }
}
