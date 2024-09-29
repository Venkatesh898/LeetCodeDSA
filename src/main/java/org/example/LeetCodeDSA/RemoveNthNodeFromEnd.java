package org.example.LeetCodeDSA;

public class RemoveNthNodeFromEnd {
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
    public static  Node removeNthFromEnd(Node head, int n) {
        if(head==null && head.next ==null)
        {
            return null;
        }
        Node refptr=head;
        Node mainptr=head;
        int count=0;

        while(count<n)
        {
            refptr=refptr.next;
            count++;
        }
        if(refptr==null)
        {
            head=head.next;
            return head;
        }
        while(refptr.next!=null)
        {

            mainptr=mainptr.next;
            refptr=refptr.next;
        }
        mainptr.next=mainptr.next.next;

        return head;
 }
    public static void main(String[] args) {
        RemoveNthNodeFromEnd obj=new RemoveNthNodeFromEnd();
        obj.head=new Node(1);
        Node first=new Node(2);
        Node second=new Node(3);
        Node third=new Node(4);
        Node fourth=new Node(5);
        obj.head.next=first;
        first.next=second;
        second.next=third;
        System.out.println("given Linked List:");
        printList(obj.head);
        System.out.println("After removing Nth node");
        Node ans=removeNthFromEnd(obj.head,2);
        printList(ans);


    }
}
