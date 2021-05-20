package dynamicprogramming;

import java.util.Arrays;

public class LCSRecursiveWithMemoization {

    public static int findLongestCommonSubSequence(String x, String y, int[][] result, int m, int n){
        if(m == 0 || n == 0)
            return 0;

        if(result[m-1][n-1]!= -1)
            return result[m-1][n-1];

        if(x.charAt(m-1) == y.charAt(n-1))
            result[m-1][n-1] = 1+findLongestCommonSubSequence(x,y,result,m-1,n-1);
        else
            result[m-1][n-1]=Math.max(findLongestCommonSubSequence(x,y,result,m,n-1),findLongestCommonSubSequence(x,y,result,m-1,n));

        return result[m-1][n-1];
    }


    public static void main(String... args){
        String A = "abbcdgf";
        String B = "bbadcgf";
        char[] charA = A.toCharArray();
        char[] charB = B.toCharArray();

        int[][] result = new int[charA.length][charB.length];
       for(int[] row :result){
           Arrays.fill(row,-1);
       }
        System.out.println(findLongestCommonSubSequence(A,B,result, A.length(), B.length()));
    }
}
