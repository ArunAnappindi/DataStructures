package com.arrays;

public class RotatingBinarySearch {


    public static void main(String[] args) {
//13,14,15, 16, 17,18, 19, 11,12
        int[]  binaryTree = {13, 14, 15, 1, 2, 3, 7, 9, 10, 11, 12}; //{5, 6, 7, 9, 10, 11, 1, 2, 3};// {13, 14, 15, 1, 2, 3, 7, 9, 10, 11, 12}
        int target = 13;
        rotatingBinarySearch(binaryTree, target);
    }

    private static void rotatingBinarySearch(int[] binaryTree, int target) {
        int start = 0;
        int end = binaryTree.length - 1;
        System.out.println(helper(binaryTree, target, start, end));
    }

    private static int helper(int[] binaryTree, int target, int start, int end) {

        if(start < 0 || end < 0 || start > end) {
            return -1;
        }
        int mid = start + (end - start)/2;

        if(binaryTree[mid] == target) {
            return mid;
        }

        if( binaryTree[start] <= binaryTree[mid]){
            if(binaryTree[start] <= target &&  binaryTree[mid] >= target ) {
                end = mid-1;
            } else {
                start = mid + 1;
            }
        } else {
            if(binaryTree[mid] <= target && target <= binaryTree[end]) {
                start = mid +1;
            } else {
                end = mid -1;
            }
        }


        return helper(binaryTree, target, start, end);

    }
}
