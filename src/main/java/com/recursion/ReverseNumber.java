package com.recursion;

public class ReverseNumber {



    public static void main(String[] args) {
        rev(1432);

        System.out.println(palindrome(14341));
    }

    private static boolean palindrome(int number) {
        return number == rev(number);
    }

    private static int rev(int number) {
        int revNum = 0;
        revNum = helper(number, revNum);
        System.out.println(revNum);
        return revNum;


    }

    private static int helper(int number, int revNum) {
        if(number%10 == number) {
            return revNum * 10 + number;
        }
        int num = number % 10;
        revNum = revNum *10 + num;
        return helper(number/10, revNum);
    }



}
