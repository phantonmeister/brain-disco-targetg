package dynamicprogramming;

public class ZeroOneKnapSack {

    public static int[][] findMaxProfitInZeroOneKnapSack(int[] profit, int[] weight, int maxWeight){

        int n = weight.length;
        int[][] dpLookupTable = new int[n+1][maxWeight+1];
        for(int i =0; i <n+1;i++) {
            for(int j =0; j <=maxWeight; j++){
                if(i == 0 || j ==0)
                    dpLookupTable[i][j] = 0;
                else if (j >= weight[i-1])
                    dpLookupTable[i][j] =  Math.max(dpLookupTable[i-1][j], profit[i-1]+dpLookupTable[i-1][j-weight[i-1]]);
                else
                    dpLookupTable[i][j] = dpLookupTable[i-1][j];
            }
        }
        System.out.println(dpLookupTable[n][maxWeight]);
        return dpLookupTable;
    }
    public static void main (String... args){
//        int[] profit = {1,2,5,6};
//        int[] weight = {2,3,4,5};
//        int maxWeight = 8;
        int[] profit = {60,100,120};
        int[] weight = {10,20,30};
        int maxWeight = 50;
        int[][] result =  findMaxProfitInZeroOneKnapSack(profit, weight,maxWeight);
        int i = weight.length;
        int j = maxWeight;
        while(i >0 && j >0) {
            if(result[i][j] == result[i-1][j]) {
                i--;
            }
            else {
                System.out.println("Weight: " +weight[i - 1] + " : " + "Is Selected");
                j = j - weight[i-1];
                i--;
            }
        }
    }
}
