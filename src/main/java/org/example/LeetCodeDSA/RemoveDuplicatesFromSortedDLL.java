package org.example.LeetCodeDSA;

public class RemoveDuplicatesFromSortedDLL {
    class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data = data;
            next = prev = null;
        }
    }
    Node removeDuplicates(Node head){
        // Code Here.
        if(head==null||head.next==null)
            return head;
        Node temp=head;
        Node nextNode;
        while(temp!=null)
        {
            nextNode=temp.next;
            while(nextNode!=null&&temp.data==nextNode.data)
            {
                nextNode=nextNode.next;
            }
            if(nextNode!=null)
            {
                temp.next=nextNode;
                nextNode.prev=temp;
            }
            else
            {
                temp.next=nextNode;
            }
            temp=temp.next;
        }
        return head;

    }
}
