package com.epam.javacore2019.solutions.arrays_and_strings.anargams;

// Task 1.1

public class CheckForAnagrams {

    public static boolean check (String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] letters = new int[256];

        char[] str1InChars = str1.toCharArray();
        for (char ch : str1InChars) {
            letters[ch]++;
        }

        for (int i = 0, k = str2.length(); i < k; i++) {
            int charInInt = (int)str2.charAt(i);
            if (--letters[charInInt] < 0) {
                return false;
            }
        }

        return true;
    }
}
