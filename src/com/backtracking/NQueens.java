package backtracking;

import java.util.ArrayList;
import java.util.List;
/*
This solution tries every queen in every row first.
 */
public class NQueens {

    static ArrayList<List<Integer>> result = new ArrayList<>();

    private static boolean isSafe(int[][] board, int row, int col){

        int i, j;
        int N = board.length;
        /* Check this row on left side */
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;
        /* Check upper diagonal on left side */
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;
        /* Check lower diagonal on left side */
        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;

    }

    public static boolean solveNQUtil(int[][] board, int col) {
       /* base case: If all queens are placed
        then return true */
        int N = board.length;
        if (col == N) {

            List<Integer> v = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (board[i][j] == 1)
                        v.add(j + 1);
                }
            }
            result.add(v);
            return true;
        }

        /* Consider this column and try placing
        this queen in all rows one by one */
        boolean res = false;
        for (int i = 0; i < N; i++) {
            /* Check if queen can be placed on
            board[i][col] */
            if (isSafe(board, i, col)) {
                /* Place this queen in board[i][col] */
                board[i][col] = 1;

                // Make result true if any placement
                // is possible
                res = solveNQUtil(board, col + 1) || res;

                /* If placing queen in board[i][col]
                doesn't lead to a solution, then
                remove queen from board[i][col] */
                board[i][col] = 0; // BACKTRACK
            }
        }

        /* If queen can not be place in any row in
            this column col then return false */
        return res;
    }

    private static List<List<Integer>> solveNQueens(int numOfQueens) {
        if(numOfQueens <= 0) {
            return new ArrayList<>();
        }

        int[][] board = new int[numOfQueens][numOfQueens];

        boolean res = solveNQUtil(board,0);

        if(res)
            return result;
        return new ArrayList<>();
    }

    public static void main(String... args){
        int numOfQueens = 100;
        List<List<Integer>> result = solveNQueens(numOfQueens);
        System.out.println(result);
    }
}
