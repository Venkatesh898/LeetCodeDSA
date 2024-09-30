package org.example.LeetCodeDSA;

public class PalindromicLinkedList {
    ListNode head;
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static boolean isPalindrome(ListNode head) {
        ListNode sp=head;
        ListNode fp=head;
        ListNode curr=head;
        while(fp!=null&&fp.next!=null)
        {
            sp=sp.next;
            fp=fp.next.next;
        }
        ListNode mid;
        if(fp==null)
            mid=reverse(sp);
        else
            mid=reverse(sp.next);
        while(mid!=null)
        {
            if(mid.val!=curr.val)
            {
                return false;
            }
            curr=curr.next;
            mid=mid.next;
        }
        return true;

    }
    public static ListNode  reverse(ListNode head)
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
        PalindromicLinkedList pll=new PalindromicLinkedList();
        pll.head=new ListNode(1);
        ListNode first=new ListNode(2);
        ListNode second=new ListNode(3);
        ListNode third=new ListNode(1);
        pll.head.next=first;
        first.next=second;
        second.next=third;
        System.out.println("Given LinkedList is :");
        printList(pll.head);
        System.out.println(isPalindrome(pll.head));
    }
}
