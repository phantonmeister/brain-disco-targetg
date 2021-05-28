package backtracking;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
/*
In this solution we are placing queens in column and then the rest in other columns.
 */
public class NQueensColumnMove {

    ArrayList<List<Integer>> result = new ArrayList<>();
    public static boolean isSafe(int[][] board, int row, int column){
        int length = board.length;
        int i,j;

        for (i = row; i >=0; i-- ){
            if(board[i][column] == 1)
                return false;
        }
        for(i = row,j =column; i >=0 && j >=0; i--,j--){
            if(board[i][j] == 1)
                return false;
        }
        for(i = row, j = column; i >=0&& j <length; i--,j++){
            if(board[i][j] == 1)
                return false;
        }
        return true;
    }
    public static boolean nQueensBackTrack(int[][] board, int row){
        int length = board.length;
        if(length == row){
            System.out.println("[");
            for (int i = 0; i < board.length; i++)
                for(int j = 0; j < board.length; j++){
                    if(board[i][j] == 1){
                        System.out.println(j+1);
                    }
                }
            System.out.println("]"+"\n");
            return true;
        }
        boolean res = false;
        for(int i = 0; i < board.length; i++){
            if(isSafe(board, row, i)){
                board[row][i] = 1;
                res = nQueensBackTrack(board, row+1) || res;
                board[row][i] = 0; //BACKTRACK
            }
        }
        return res;
    }

    public static void nQueensUtil(int queens){
    int[][] board = new int[queens][queens];
    nQueensBackTrack(board,0);
}

    public static void main(String... args){
        int QueensNum = 4;
        nQueensUtil(4);
    }
}
