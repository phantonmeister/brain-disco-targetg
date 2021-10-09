package heaps;

public class Heapify {

    /*
      Given an unsorted array, this heapify function will convert the array into a max heap.
     */

     static void heapify(int [] unsortedInput, int size, int rootedAt) {

        int left = 2*rootedAt+1;
        int right = 2*rootedAt+2;
        int largest = rootedAt;

        //If left child is greater than root, mark that index are greater
        if (left < size && unsortedInput[left] > unsortedInput[largest])
            largest = left;
        //If right child is greater than root, mark that index are greater
        if(right < size && unsortedInput[right] > unsortedInput[largest])
            largest = right;

        // If Original root is not greater, than we swap with the greatest and then heapify down.
        if(largest != rootedAt) {
            int swap = unsortedInput[rootedAt];
            unsortedInput[rootedAt] = unsortedInput[largest];
            unsortedInput[largest] = swap;

            heapify(unsortedInput, size, largest);
        }
    }

      static void buildHeap(int[] unsortedInput){

        int size = unsortedInput.length;
        int startIndex = size/2-1;

        for(int i=startIndex;i>=0;i-- ){

            heapify(unsortedInput,size,i);
        }
    }

    public static void main(String... args) {

        int [] unsortedInput = new int[] {13,5,30,25,40,60,1,5,70};

         buildHeap(unsortedInput);

        for (int e : unsortedInput) {
            System.out.println(e );
        }
    }}
