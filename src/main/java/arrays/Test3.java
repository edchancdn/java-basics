package arrays;

import java.util.Arrays;

public class Test3 {
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
        System.out.println("input array: " + Arrays.toString(arr));

        int pivotPoint = 3;
        int[] pArr = new int[arr.length];

        // expected result: {2,1,0,4,5,6,7}
        pArr = reverseSubset(arr, 0, pivotPoint - 1);

        // expected result: {2,1,0,7,6,5,4}
        pArr = reverseSubset(pArr, pivotPoint, arr.length - 1);

        // expected result: {4,5,6,7,0,1,2}
        pArr = reverseSubset(pArr, 0, arr.length - 1);

        System.out.println("output array: " + Arrays.toString(pArr));
    }

    /* Method: Reverse the subset of items in the given array using the given start and end indexes.
       Example:
         input:  {1,2,3,4,5,6}, 0, 2
         output: {2,1,3,4,5,6}
     */
    private static int[] reverseSubset(int[] arr, int startIndex, int endIndex) {
        int[] revArr = new int[arr.length];
        int j = endIndex;
        // loop through the input array
        for(int i = 0; i < arr.length; i++) {
            // store the subset of array items in reverse order
            if((i >= startIndex) && (i <= endIndex)) {
                revArr[j] = arr[i];
                j--;
            // keep the original order of the rest of the array items
            } else {
                revArr[i] = arr[i];
            }
        }
        return revArr;
    }
}
