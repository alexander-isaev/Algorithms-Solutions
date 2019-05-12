package com.epam.javacore2019.solutions.arrays_and_strings.check_if_сhar_occurs_only_once;

// Tast 1.2

public class CheckIfCharsOccursOnlyOnce {

    public static boolean check (String inputString) {
        String lowCaseString = inputString.toLowerCase();
        int counter = 0;
        for (int i = 0, k = lowCaseString.length(); i < k; i++) {
            int val = lowCaseString.charAt(i) - 'a';
            if ((counter & (1 << val)) > 0) {
                return false;
            }
            counter |= (1 << val);
        }
        return true;
    }
}
