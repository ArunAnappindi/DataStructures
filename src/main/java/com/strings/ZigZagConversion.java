package com.strings;

public class ZigZagConversion {

    public static String convert(String s, int numRows) {

        int length = s.length();
        if (s.length() == 1) {
            return s;
        }

        char[][] zigzagArr = new char[numRows][s.length()-1];
        int charCount = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < numRows; j++) {
               if(charCount == s.length()) {
                   break;
               }
                if (i % (numRows - 1) == 0) {
                    zigzagArr[j][i] = s.charAt(charCount);
                    charCount++;
                } else {
                    int index = numRows - 1 - i;
                    int temp = i;
                    if(i >= numRows) {
                        temp = i % (numRows - 1);
                        index = numRows - 1 - temp;
                    }
                    //if(i < numRows) {

                        zigzagArr[index][i] = s.charAt(charCount);
                        charCount++;
                        break;
                    //}
                }


            }
        }

        StringBuilder stringVal = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < length-1; j++) {
                if(zigzagArr[i][j] != 0) {
                stringVal.append(zigzagArr[i][j]);
                 }
            }
        }
        System.out.println(stringVal.toString());
        return stringVal.toString();
    }


    public static void main(String[] args) {
        convert("PAYPALISHIRING", 4);
    }
}
