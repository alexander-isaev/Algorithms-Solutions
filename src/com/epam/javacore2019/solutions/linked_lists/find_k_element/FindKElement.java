package com.epam.javacore2019.solutions.linked_lists.find_k_element;

import com.epam.javacore2019.solutions.linked_lists.Node;

// 2.2
public class FindKElement {

    public static Node findAndGetElement(Node node, int k) {
        if (k <= 0) {
            return null;
        }

        Node pointer1 = node;
        Node pointer2 = node;

        for (int i = 0; i < k - 1; i++) {
            if (pointer2 == null) {
                return null;
            }
            pointer2 = pointer2.next;
        }
        if (pointer2 == null) {
            return null;
        }

        while (pointer2.next != null) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        return pointer1;
    }
}
