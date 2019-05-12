package com.epam.javacore2019.solutions.arrays_and_strings.strings_almost_equal;

// 1.5
public class StringsAlmostEqual {

    public static boolean isAlmostEqual (String str1, String str2) {
        if (Math.abs(str1.length() - str2.length()) > 1) {
            return false;
        }

        int counter = 0;
        char[] str1InChar = str1.toCharArray();
        char[] str2InChar = str2.toCharArray();

        for(int i = 0, k = str1InChar.length, l = str2InChar.length; i < k && i < l; i++) {
            if (str1InChar[i] != str2InChar[i]) {
                counter++;
                if (counter > 1) {
                    return false;
                }
            }
            i++;
        }

        return true;
    }
}
