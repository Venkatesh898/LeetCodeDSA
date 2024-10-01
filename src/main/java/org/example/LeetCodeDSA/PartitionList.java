package org.example.LeetCodeDSA;

public class PartitionList {
    ListNode head;
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
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
        PartitionList pl=new PartitionList();
        pl.head=new ListNode(1);
        ListNode first=new ListNode(4);
        ListNode second=new ListNode(3);
        ListNode third=new ListNode(2);
        ListNode fourth=new ListNode(5);
        ListNode fifth=new ListNode(2);
        pl.head.next=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        System.out.println("given LL: ");
        printList(pl.head);
        ListNode ans=partition(pl.head,3);
        System.out.println("after partioning: ");
        printList(ans);



    }
    public static ListNode partition(ListNode head, int x) {
        ListNode prev=new ListNode(0);
        ListNode p1=prev;
        ListNode greater=new ListNode(0);
        ListNode g1=greater;
        ListNode temp=head;
        while(temp!=null)
        {
            if(temp.val<x)
            {
                p1.next=temp;
                p1=temp;
            }
            else
            {
                g1.next=temp;
                g1=temp;
            }
            temp=temp.next;
        }
        p1.next=greater.next;
        g1.next=null;
        return prev.next;


    }
}
