package sorting;

import java.util.Arrays;
/*
Assumes element at index 0 is pivot. For some array arrangements running time is n^2.
TO address this, generate a random number between the bounds of array, use that element as pivot. Exchange it
with the element at index 0 and continue with regular QuickSort.
 */
public class QuickSort {

    public static int partition(int[] input, int low, int high) {

        int pivot = input[low];
        int i = low;
        int j = high+1;

        while (i < j) {
        do {
            i++;
        } while (input[i] <= pivot);
        do {
            j--;
        } while (input[j] > pivot);

        if (i < j)
            swap(input, i, j);
    }
        swap(input, low, j);
        return j;
    }

    public static void quickSort(int[] input, int l, int h){
        if(l < h){
            int partition = partition(input, l,h);
            if(partition != 0)
                quickSort(input,l,partition-1);
            if(partition != input.length-1)
                quickSort(input, partition+1, h);
        }
    }

    public static void swap(int[] input, int i, int j){
        int temp = input[j];
        input[j] = input[i];
        input[i] = temp;
    }

    public static void main(String... args){
        int[] input = {10,30,80,90,40,50,70};
        quickSort(input, 0, input.length-1);
        System.out.println(Arrays.toString(input));
    }
}
