package com.epam.javacore2019.solutions.linked_lists.sum_of_two_numbers;

import com.epam.javacore2019.solutions.linked_lists.Node;

public class SumOfTwoNumbers {

    public static Node sum (Node node1, Node note2) {
        int  firstNumberInString = listToIntereg(node1);
        int secondNumberInString = listToIntereg(note2);
        int sum = firstNumberInString + secondNumberInString;
        Node newList = new Node(sum % 10);
        sum /= 10;
        while (sum > 0) {
            newList.appendToTail(sum % 10);
            sum /= 10;
        }

        return newList;
    }

    private static Integer listToIntereg(Node node) {
        StringBuilder stringBuilder = new StringBuilder();
        Node tempNode = node;
        while (tempNode != null) {
            stringBuilder.append(tempNode.data);
            tempNode = tempNode.next;
        }

        return Integer.parseInt(new String(stringBuilder.reverse()));
    }
}
