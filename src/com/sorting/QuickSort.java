package sorting;

import java.util.Arrays;

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
