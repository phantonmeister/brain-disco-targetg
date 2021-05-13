package arrays;

public class MergeTwoSortedArrays {

    /* Given two sorted arrays of variable length merge them.
    Ex :- {4,5,8,13,16} and {1,5,7,10,12,18,20}

     */

    public static void mergeSortedArrays(int[] input1, int [] input2) {

        int[] result = new int[input1.length+input2.length];
        int i = 0,j = 0,k = 0;
       while(i<input1.length && j< input2.length) {

            if(input1[i] < input2[j]) {
               result[k++]=input1[i++];

            }
            else  {
                result[k++]=input2[j++];
            }
        }

       while(i< input1.length) {
           result[k++]= input1[i++];
       }

       while(j< input2.length) {
           result[k++]=input2[j++];
       }

       for( int p= 0; p < result.length; p++ ) {
           System.out.println(result[p]);
       }
    }


    public static void main(String... args) {

        int[] input= {4,5,8,13,16};
        int[] input2 = {1,5,7,10,12,18,20};

        mergeSortedArrays(input, input2);
    }
}
