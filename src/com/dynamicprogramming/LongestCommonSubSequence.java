package dynamicprogramming;
/*
Given two strings A and B. Find the longest common sequence ( A sequence which does not need to be contiguous), which is common in both the strings.

You need to return the length of such longest common subsequence.
Example Input
Input 1:

 A = "abbcdgf"
 B = "bbadcgf"

Example Output
Output 1:
 5

 */
public class LongestCommonSubSequence {

    public static int findLongestCommonSubSequence(char[] x, char[] y){
        int m = x.length;
        int n = y.length;
        int[][] result = new int[m+1][n+1];
        for(int i = 0; i <= x.length; i++){
            for (int j = 0; j <=y.length; j++){
                if(i ==0 || j ==0)
                     result[i][j]=0;
                else if (x[i-1] == y[j-1])
                    result[i][j] = 1+ result[i-1][j-1];
                else
                    result[i][j] = Math.max(result[i][j-1], result[i-1][j]);
            }
        }
        return result[m][n];
    }

    public static void main(String... args){
        String A = "abbcdgf";
        String B = "bbadcgf";
        char[] charA = A.toCharArray();
        char[] charB = B.toCharArray();

        System.out.println(findLongestCommonSubSequence(charA,charB));

    }



}
