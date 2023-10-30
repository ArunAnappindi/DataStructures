package com.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementing Kadane's algorithm to find out the subarray that returns the max sum.
 *
 */
public class FindMaxSumSubArray {


    public static void main(String[] args) {

        int[] numArray = {4,3,-2,6,-12,7,-1,6};
        findMaxSumSubArray(numArray);

    }

    private static void findMaxSumSubArray(int[] numArray) {
        int currMax = 0;
        int maxSoFar = 0;

        List<Integer> subArr = new ArrayList<>();
        for(int i =0; i < numArray.length; i++) {
            if(numArray[i] + currMax > numArray[i]) {
                subArr.add(numArray[i]);
                currMax = numArray[i] + currMax;
            } else {
                subArr.clear();
                subArr.add(numArray[i]);
                currMax = numArray[i];
            }

            if(currMax > maxSoFar) {
                maxSoFar = currMax;
            }
        }
    }

}
