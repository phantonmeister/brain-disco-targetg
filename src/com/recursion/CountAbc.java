package recursion;

/*
Count recursively the total number of "abc" and "aba" substrings that appear in the given string.

countAbc("abc") → 1
countAbc("abcxxabc") → 2
countAbc("abaxxaba") → 2
 */
public class CountAbc {
    public static void main(String... args) {

        System.out.println(countAbc("xhiabahix"));
    }

    static int countAbc(String n) {
        if(n.length() < 3)
            return 0;
        if(n.substring(0,3).equals("abc") || n.substring(0,3).equals("aba"))
            return 1+countAbc(n.substring(1));
        return countAbc(n.substring(1));
    }
}
