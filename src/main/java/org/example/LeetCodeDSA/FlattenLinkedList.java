package org.example.LeetCodeDSA;

import java.util.Scanner;

class Node {
    int data;
    Node next, bottom;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.bottom = null;
    }
}

class Solution {
    Node flatten(Node root) {
        if (root == null || root.next == null)
            return root;

        Node it = mergeTwo(root, root.next);

        if (root.next.next == null)
            return it;

        root = root.next.next;
        Node trav = root;

        while (trav != null) {
            it = mergeTwo(it, trav);
            trav = trav.next;
        }

        return it;
    }

    Node mergeTwo(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node dummy1 = dummy;
        Node head11 = head1, head22 = head2;

        while (head11 != null && head22 != null) {
            if (head11.data <= head22.data) {
                dummy1.bottom = head11;
                head11 = head11.bottom;
            } else {
                dummy1.bottom = head22;
                head22 = head22.bottom;
            }
            dummy1 = dummy1.bottom;
        }

        if (head11 != null) {
            dummy1.bottom = head11;
        } else if (head22 != null) {
            dummy1.bottom = head22;
        }

        return dummy.bottom;
    }

    void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.bottom;
        }
        System.out.println();
    }
}

public class FlattenLinkedList {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        Node head = new Node(5);
        head.next = new Node(10);
        head.next.next = new Node(19);
        head.next.next.next = new Node(28);

        head.bottom = new Node(7);
        head.bottom.bottom = new Node(8);
        head.bottom.bottom.bottom = new Node(30);

        head.next.bottom = new Node(20);

        head.next.next.bottom = new Node(22);
        head.next.next.bottom.bottom = new Node(50);

        head.next.next.next.bottom = new Node(35);
        head.next.next.next.bottom.bottom = new Node(40);
        head.next.next.next.bottom.bottom.bottom = new Node(45);

        Solution sol = new Solution();
        Node flattenedList = sol.flatten(head);

        System.out.println("Flattened linked list:");
        sol.printList(flattenedList);
    }
}
