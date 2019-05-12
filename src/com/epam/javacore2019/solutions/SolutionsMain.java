package com.epam.javacore2019.solutions;

import com.epam.javacore2019.solutions.arrays_and_strings.anargams.CheckForAnagrams;
import com.epam.javacore2019.solutions.arrays_and_strings.check_if_сhar_occurs_only_once.CheckIfCharsOccursOnlyOnce;
import com.epam.javacore2019.solutions.arrays_and_strings.matrix_to_zero.MatrixToZero;
import com.epam.javacore2019.solutions.arrays_and_strings.replace_spaces.ReplaceSpaces;
import com.epam.javacore2019.solutions.arrays_and_strings.strings_almost_equal.StringsAlmostEqual;
import com.epam.javacore2019.solutions.linked_lists.Node;
import com.epam.javacore2019.solutions.linked_lists.check_for_palindrome.CheckListForPalindrome;
import com.epam.javacore2019.solutions.linked_lists.delete_all_dublicates.DeleteAllDublicates;
import com.epam.javacore2019.solutions.linked_lists.find_k_element.FindKElement;
import com.epam.javacore2019.solutions.linked_lists.sum_of_two_numbers.SumOfTwoNumbers;

public class SolutionsMain {

    public static void main(String[] args) {
        // 1.1
        if (CheckIfCharsOccursOnlyOnce.check("fdc")) {
            System.out.println("True!");
        }

        // 1.2
        if (CheckForAnagrams.check("raav", "vara")) {
            System.out.println("True!");
        }

        // 1.3
        System.out.println(ReplaceSpaces.replace("raav yor  rtrt"));

        // 1.8
        int[][] matrix = {
                {4,5,6,7},
                {3,5,1,9},
                {2,0,1,6}
        };
        MatrixToZero.setToZero(matrix, 2, 1);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        // 1.5
        if (StringsAlmostEqual.isAlmostEqual("pale", "ple")) {
            System.out.println("True!");
        }

        // 2.1
        Node node = new Node(1);
        node.appendToTail(2);
        node.appendToTail(2);
        node.appendToTail(2);
        node.appendToTail(3);

        node.printList();
        DeleteAllDublicates.deleteDublicates(node);
        node.printList();

        // 2.2
        System.out.println(FindKElement.findAndGetElement(node, 1).data);

        // 2.3
        node.deleteNode(2);
        node.printList();

        // 2.6
        Node node2 = new Node(1);
        node2.appendToTail(2);
        node2.appendToTail(1);
        if (CheckListForPalindrome.check(node2)) {
            System.out.println("Palindrome!");
        }

        // 2.5
        Node sum = SumOfTwoNumbers.sum(node, node2);
        sum.printList();
    }
}
