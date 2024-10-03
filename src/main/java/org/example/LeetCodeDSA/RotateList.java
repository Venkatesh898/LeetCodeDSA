package org.example.LeetCodeDSA;

public class RotateList {
    ListNode head;
    static class ListNode {
        int val;
        ListNode  next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode rotateRight(ListNode head, int k)
    {
        if(head==null||head.next==null)
        {
            return head;
        }
        int count=len(head);
        if(count==k)
        {
            return head;
        }
        return removeAtEnd(head,k%count);



    }
    public ListNode removeAtEnd(ListNode head, int k)
    {
        while(k>0)
        {
            ListNode curr=head;
            ListNode prev=head;
            while(curr.next!=null)
            {
                prev=curr;
                curr=curr.next;
            }
            prev.next=null;
            curr.next=head;
            head=curr;
            k--;

        }
        return head;
    }

    public int len(ListNode head)
    {
        ListNode curr=head;
        int count=0;
        while(curr!=null)
        {
            count++;
            curr=curr.next;
        }
        return count;
    }
    public static void  printList(ListNode head)
    {
        ListNode curr=head;
        while(curr!=null)
        {
            System.out.print(curr.val+" ->");
            curr=curr.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        RotateList rotateList=new RotateList();
        rotateList.head=new ListNode(1);
        ListNode first=new ListNode(2);
        ListNode second=new ListNode(3);
        ListNode third=new ListNode(4);
        ListNode fourth=new ListNode(5);
        rotateList.head.next=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        System.out.println("given Linked List is:");
        printList(rotateList.head);
        System.out.println("After rotation of the Linked List:");
        ListNode ans=rotateList.rotateRight(rotateList.head,2);
        printList(ans);

    }
}
