package arrays;

import java.util.Arrays;
import java.util.Collections;

public class Test2 {

    /* problem statement:
    given array [0,1,2,4,5,6,7]
    if pivot point is at index 3
    then resulting array [4,5,6,7,0,1,2 ]
    OR
    given array [1,2,3,4,5,6,7,8,9,10,11]
    if pivot point is at index 3
    then resulting array [4, 5, 6, 7, 8, 9, 10, 11, 1, 2, 3]
     */

    public static void main(String[] args) {

        int[] arr = new int[] {0,1,2,4,5,6,7};
        //int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10,11};

        int[] pArr = new int[arr.length];
        // first option
        //pArr = pivot(arr, 3);

        // second option
        int pivotPoint = 2;
        pArr = reverse(arr, 0, pivotPoint);
        pArr = reverse(pArr, pivotPoint + 1, arr.length - 1);
        pArr = reverse(pArr, 0, arr.length - 1);
    }

    private static int[] pivot(int[] arr, int pivotIndex) {
        System.out.println("input array: " + Arrays.toString(arr));

        // get the array length
        int len = arr.length;

        // get the index where pivoted items (items currently on the left of the pivot index)
        // will be located on the output array
        int oPivIx = len - pivotIndex;

        // create an array of the same length as the input array
        int[] pArr = new int[len];

        // loop through input array
        for(int i = 0; i < len; i++) {

            int rePos = 0;

            // if the array item is currently to the right of or on the pivot point in the input array,
            // then reposition this item to the left of the pivot point in the output array.
            if(i >= pivotIndex) {

                // get the reposition index
                rePos = i - pivotIndex;
            } else {

                // else if the array item is currently to the left of the pivot point in the input array,
                // then reposition this item to the right of the pivot point in the output array.

                // get the reposition index
                rePos = i + oPivIx;

            }
            // add array item into output array using the reposition index
            pArr[rePos] = arr[i];
        }

        System.out.println("output array: " + Arrays.toString(pArr));

        return pArr;
    }

    /* Reverse the subset of items in the given array using the given start and end indexes.
       input:  {1,2,3,4,5,6}, 0, 2
       output: {3,2,1,4,5,6}
     */
    private static int[] reverse(int[] arr, int startIndex, int endIndex) {
        System.out.println(Arrays.toString(arr));
        // deep copy the input array - need to create a separate object in the heap for the output array (reference)
        int[] revArr = arr.clone();

        int j = endIndex;
        // loop through the input array using the start and end index inputs
        for(int i = startIndex; i <= endIndex; i++) {
            // store the array item in reverse order into the output array
            revArr[j] = arr[i];
            j--;
        }
        System.out.println(Arrays.toString(revArr));
        return revArr;
    }

}
