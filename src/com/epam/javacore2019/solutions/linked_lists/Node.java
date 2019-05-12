package com.epam.javacore2019.solutions.linked_lists;

public class Node {
    public Node next = null;
    public int data;

    public Node(int data) {
        this.data = data;
    }

    public void appendToTail(int data) {
        Node end = new Node(data);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    public Node deleteNode(int data) {
        Node n = this;

        if (n.data == data) {
            return this.next;
        }

        while (n.next != null) {
            if (n.next.data == data) {
                n.next = n.next.next;
                return this;
            }
            n = n.next;
        }
        return this;
    }

    public int getElementByIndex(int index) {
        Node n = this;
        for (int i = 0; i < index; i++) {
            if (n.next != null) {
                n = n.next;
            } else {
                return -1;
            }
        }
        return n.data;
    }

    public void printList() {
        Node tempNode = this;
        while (tempNode != null) {
            System.out.print(tempNode.data);
            tempNode = tempNode.next;
        }
        System.out.println();
    }
}
