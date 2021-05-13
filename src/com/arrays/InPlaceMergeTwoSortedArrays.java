package arrays;

import java.util.Arrays;

/*
Given two sorted arrays merge them in place. No new output array is created.

Example :- Input:

X[] = { 1, 4, 7, 8, 10 }
Y[] = { 2, 3, 9 }

Output:

X[] = { 1, 2, 3, 4, 7 }
Y[] = { 8, 9, 10 }
 */
public class InPlaceMergeTwoSortedArrays {

    private static void mergeAndPrint(int[] x, int[] y) {

        int xSize = x.length;
        int ySize = y.length;

       for(int l =0; l < xSize; l++){
            if (x[l] > y[0]) {
                int swap = y[0];
                y[0] = x[l];
                x[l] = swap;

                int first = y[0];
                int i;
                for(i =1; i < ySize&&y[i]<first;i++){
                    y[i-1] = y[i];
                }
                y[i-1]= first;
            }
        }
    }

    public static void main(String... args){
        int[] x = { 1, 4, 7, 8, 10 };
        int[] y = {2,3,9};

        mergeAndPrint(x,y);

        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
    }
}
