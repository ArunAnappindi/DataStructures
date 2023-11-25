package com.arrays;

public class RotatingBinarySearch {


    public static void main(String[] args) {

        int[]  binaryTree = {13, 14, 15, 1, 2, 3, 7, 9, 10, 11, 12}; //{5, 6, 7, 9, 10, 11, 1, 2, 3};// {13, 14, 15, 1, 2, 3, 7, 9, 10, 11, 12}
        int target = 14;
        rotatingBinarySearch(binaryTree, target);
    }

    private static void rotatingBinarySearch(int[] binaryTree, int target) {
        int start = 0;
        int end = binaryTree.length - 1;
        System.out.println(helper(binaryTree, target, start, end));
    }

    private static int helper(int[] binaryTree, int target, int start, int end) {

        int mid = start + (end - start)/2;

        if(binaryTree[mid] == target) {
            return mid;
        } else if(binaryTree[mid] > target && binaryTree[start] < target) {
            end = mid-1;
        } else if(binaryTree[mid] > target && binaryTree[start] > target) {
            start = mid+1;
        } else if(binaryTree[mid] < target && binaryTree[start] < target) {
            end = mid-1;
        } else if(binaryTree[mid] < target && binaryTree[start] > target) {
            start = mid+1;
        }

        return helper(binaryTree, target, start, end);

    }
}
