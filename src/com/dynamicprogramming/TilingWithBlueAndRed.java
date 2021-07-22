package dynamicprogramming;
/*
How many ways can you tile a board of length of 5 with red tiles of length 1 and blue tiles of length 2.
 */
public class TilingWithBlueAndRed {

    public static int returnNumberOfWaysOfTiling(int boardLength){

        if(boardLength < 0)
            return 0;

        if(boardLength == 1 || boardLength == 0)
            return boardLength;

        return returnNumberOfWaysOfTiling(boardLength-1) + returnNumberOfWaysOfTiling(boardLength -2);
    }
    public static void main(String... args){
        int boardLength = 5;
        System.out.println(returnNumberOfWaysOfTiling(boardLength));

    }
}
