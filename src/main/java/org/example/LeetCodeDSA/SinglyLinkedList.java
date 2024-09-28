package org.example.LeetCodeDSA;

public class SinglyLinkedList {
    Node head;
    static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
        }
    }
    public static void  printList(Node head)
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+" ->");
            curr=curr.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        SinglyLinkedList sll=new SinglyLinkedList();
        sll.head=new Node(10);
        Node first=new Node(1);
        Node second=new Node(2);
        Node three=new Node(3);
        sll.head.next=first;
        first.next=second;
        second.next=three;
        printList(sll.head);

    }
}
