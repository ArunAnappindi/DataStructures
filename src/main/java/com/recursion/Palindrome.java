package com.recursion;

public class Palindrome {



    public static void main(String[] args) {
        palindrome(1234321);
    }

    private static void palindrome(int num) {

        int digits = (int)(Math.log10(num)) + 1;
        System.out.println(helper(num, digits));

    }

    private static boolean helper(int num, int digits) {
        if(num % 10 == num || num/10 == num) {
            return true;
        }

        if(num%10 == (int)(num/(Math.pow(10, digits-1)))) {
           return helper(((int)(num - (int)(Math.pow(10, digits-1))))/10, digits-2);
        } else {
            return false;
        }


    }
}
