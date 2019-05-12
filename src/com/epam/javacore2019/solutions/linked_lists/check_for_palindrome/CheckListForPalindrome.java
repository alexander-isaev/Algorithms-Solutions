package com.epam.javacore2019.solutions.linked_lists.check_for_palindrome;

import com.epam.javacore2019.solutions.linked_lists.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckListForPalindrome {

    public static boolean check(Node node) {
        if (node == null) {
            return false;
        }

        List<Integer> list = new ArrayList<>();

        Node n = node;
        while (n != null) {
            list.add(n.data);
            n = n.next;
        }
        List<Integer> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        if (reversedList.equals(list)) {
            return true;
        }

        return false;
    }
}
