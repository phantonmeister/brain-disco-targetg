package recursion;
/*
Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.

changeXY("codex") → "codey"
changeXY("xxhixx") → "yyhiyy"
changeXY("xhixhix") → "yhiyhiy"

 */
public class ChangeXY {

    public static String replace(String in){
        if(in.equals(""))
            return "";
        if(in.charAt(0) == 'x')
            return 'y'+in.substring(1);

        else
            return in.charAt(0)+replace(in.substring(1));
    }

    public static void main(String... args){
        String input = "codex";
        System.out.println(replace(input));

    }
}
