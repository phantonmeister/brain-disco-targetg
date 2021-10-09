package binarysearch;

public class BinarySearchRecursion {

    public static int binarySearchRecursive(int[] input, int elementToFind, int low, int high){

        if(high < low)
            return -1;
        if(high == low) {
            if(high < input.length-1 && input[high] == elementToFind)
                return high;
            else
                return -1;
        }
        int mid = (low +high)/2;
        if(input[mid] == elementToFind)
            return mid;
        else if (elementToFind > input[mid])
            return binarySearchRecursive(input, elementToFind,mid+1, high);
        else
            return binarySearchRecursive(input, elementToFind,low, mid-1);
        }


    public static void main(String... args) {
        int[] input = new int[]{2,5,8,10,34,56};
        int low = 0, high = input.length;
        System.out.println("Element is at index: "+binarySearchRecursive(input,100,low, high));
    }
}
