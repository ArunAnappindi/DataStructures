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

    private static void findMaxSumSubArray(int[] nums) {
        int currMax = nums[0];
        int maxSoFar = nums[0];

        List<Integer> subArr = new ArrayList<>();
        for(int i =1; i < nums.length; i++) {
            if(nums[i] + currMax > nums[i]) {
                subArr.add(nums[i]);
                currMax = nums[i] + currMax;
            } else {
                subArr.clear();
                subArr.add(nums[i]);
                currMax = nums[i];
            }

            if(currMax > maxSoFar) {
                maxSoFar = currMax;
            }
        }
    }

}
