package org.example.LeetCodeDSA;

public class MiddleElementInLinkedList {
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
    public static int middleElement(Node head)
    {
        Node sp=head;
        Node fp=head;
        while (fp!=null&&fp.next!=null)
        {
            sp=sp.next;
            fp=fp.next.next;
        }
        return sp.data;
    }

    public static void main(String[] args) {
        MiddleElementInLinkedList elementInLinkedList=new MiddleElementInLinkedList();
        elementInLinkedList.head=new Node(10);
        Node first=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        elementInLinkedList.head.next=first;
        first.next=second;
        second.next=third;
        printList(elementInLinkedList.head);
        int ans=middleElement(elementInLinkedList.head);
        System.out.println(ans);

    }
}
