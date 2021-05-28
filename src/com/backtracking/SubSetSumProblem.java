package backtracking;

public class SubSetSumProblem {

    public static void subSet_backtracking(int[] input, int index, int sum, int targetSum) {

        if(sum == targetSum){
            System.out.println("FOUND");
//            if(index < input.length)
//                subSet_backtracking(input, index+1, sum-input[index], targetSum);
        }

        else if(index < input.length && sum+input[index] <= targetSum){
            for(int i = index; i < input.length; i++){
                subSet_backtracking(input, i+1, sum+input[i], targetSum);
            }
        }
        else
            if(index < input.length)
            subSet_backtracking(input, index+1, sum, targetSum);
    }

    public static void main(String... args) {
        int[] input = {10,7,5,18,12,20,15};
        subSet_backtracking(input,0,0,35);
    }
}
