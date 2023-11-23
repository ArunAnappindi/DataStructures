package com.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNum {


    public static List<String> letterCombinations(String digits) {

        if(digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        List<String> lettersList = new ArrayList<>();



        Map<Character, char[]> charMap = new HashMap<>();
        charMap.put('2', new char[] {'a','b','c'});
        charMap.put( '3', new char[] {'d','e','f'});
        charMap.put('4', new char[] {'g','h','i'});
        charMap.put( '5',  new char[] {'j','k','l'});
        charMap.put('6', new char[] {'m','n','o'});
        charMap.put( '7', new char[] {'p','q','r'});
        charMap.put( '8', new char[] {'s','t','u'});
        charMap.put( '9', new char[] {'v','x','y','z'});

        if(digits.length() == 1) {
            char[] charArr = charMap.get('c' + digits.charAt(0));
        }

        int inputDigitsLen = digits.length();
        int lengthToLoop = digits.contains("9") ? 4 : 3;

        for(int i = 0; i < lengthToLoop; i++) {
            String letter = "";
            for(int j =0; j< inputDigitsLen; j++) {
                char var = digits.charAt(j);

                if(i < (charMap.get(var)).length ) {
                    letter = letter + String.valueOf(Array.getChar(charMap.get(var), i));
                }

            }
            lettersList.add(letter);
        }

        return lettersList;

    }


    public static void main(String[] args) {
        letterCombinations("23");
    }

}
