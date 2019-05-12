package com.epam.javacore2019.solutions.linked_lists.delete_all_dublicates;

import com.epam.javacore2019.solutions.linked_lists.Node;

import java.util.Hashtable;

// 2.1
public class DeleteAllDublicates {

    public static void deleteDublicates (Node head) {
        if (head == null) return;
        Node currentNode = head;
        
        while (currentNode != null) {
            Node runnerPointer = currentNode;
            while (runnerPointer.next != null) {
                if (runnerPointer.next.data == currentNode.data) {
                    runnerPointer.next = runnerPointer.next.next;
                } else{
                    runnerPointer = runnerPointer.next;
                }
            }
            currentNode = currentNode.next;
        }
    }
}
