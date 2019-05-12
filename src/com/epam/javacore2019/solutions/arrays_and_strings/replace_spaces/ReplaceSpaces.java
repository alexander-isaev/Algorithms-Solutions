package com.epam.javacore2019.solutions.arrays_and_strings.replace_spaces;

// Task 1.3

public class ReplaceSpaces {

    public static String replace(String inputString) {
        char[] strInChars = inputString.toCharArray();
        int lengthOfString = inputString.length();
        int numSpaces = 0;

        for (int i = 0; i < lengthOfString; i++) {
            if(strInChars[i] == ' ') {
                numSpaces++;
            }
        }

        int sizeOfNewArray = lengthOfString + 2 * numSpaces;
        char[] newCharArray = new char[sizeOfNewArray--];

        for (int i = lengthOfString - 1; i >= 0; i--) {
            char ch = strInChars[i];
            if (ch == ' '){
                newCharArray[sizeOfNewArray--] = '0';
                newCharArray[sizeOfNewArray--] = '2';
                newCharArray[sizeOfNewArray--] = '%';
            } else {
                newCharArray[sizeOfNewArray--] = ch;
            }
        }

        return new String(newCharArray);
    }
}
