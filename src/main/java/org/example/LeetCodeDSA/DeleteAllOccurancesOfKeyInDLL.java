package org.example.LeetCodeDSA;

public class DeleteAllOccurancesOfKeyInDLL {
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
     Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==x)
            {
                if(temp.prev==null)
                { Node before=head;
                    head=head.next;
                    if(head!=null)
                    {
                        head.prev=null;
                    }
                    before.next=null;
                    temp=head;
                }
                else
                {
                    Node prevNode=temp.prev;
                    Node nextNode=temp.next;
                    if(nextNode!=null)
                    {
                        nextNode.prev=prevNode;

                    }
                    prevNode.next=nextNode;
                    temp=temp.next;
                }
            }
            else
            {
                temp=temp.next;
            }
        }
        return head;
    }
}
