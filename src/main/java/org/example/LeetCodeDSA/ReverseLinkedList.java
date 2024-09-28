package org.example.LeetCodeDSA;

public class ReverseLinkedList {
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
        System.out.println();
    }
    public static   Node reverseLinkedList(Node head)
    {
        Node curr=head;
        Node prev=null;
        Node next=null;
        while (curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return  prev;


    }
    public static void main(String[] args) {
        ReverseLinkedList rll=new ReverseLinkedList();
        rll.head=new Node(10);
        Node first=new Node(1);
        Node second=new Node(2);
        Node three=new Node(3);
        rll.head.next=first;
        first.next=second;
        second.next=three;
        System.out.println("Linked List before reversal");
        printList(rll.head);
        System.out.println("Linked List After Reversal:");
        Node reversedLinkedListList=reverseLinkedList(rll.head);
        printList(reversedLinkedListList);


    }
}
