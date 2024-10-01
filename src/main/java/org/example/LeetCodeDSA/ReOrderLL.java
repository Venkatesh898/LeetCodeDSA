package org.example.LeetCodeDSA;

public class ReOrderLL {
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
    public static void reorderList(ListNode head) {
        ListNode sp=head,fp=head;
        ListNode second;
        while(fp.next!=null&&fp.next.next!=null)
        {
            sp=sp.next;
            fp=fp.next.next;
        }
        second=reverse(sp.next);
        sp.next=null;
        ListNode first=head;
        while(second!=null)
        {
            ListNode temp1=first.next;
            ListNode temp2=second.next;
            first.next=second;
            second.next=temp1;
            first=temp1;
            second=temp2;
        }

    }
    static  ListNode reverse(ListNode head)
    {
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ReOrderLL rll=new ReOrderLL();
        rll.head=new ListNode(1);
        ListNode first=new ListNode(2);
        ListNode second=new ListNode(3);
        ListNode third=new ListNode(4);
        rll.head.next=first;
        first.next=second;
        second.next=third;
        System.out.println("Given Linked List is");
        printList(rll.head);
        System.out.println("After Reordering the LL:");
        reorderList(rll.head);
        printList(rll.head);
    }
}
