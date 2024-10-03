package org.example.LeetCodeDSA;

public class MaximumTwinSumOfLL {
    ListNode head;
    static class ListNode {
        int val;
        ListNode  next;
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
    public int pairSum(ListNode head) {
        ListNode sp=head,fp=head,trav=head;
        int sum,max=0;
        while(fp!=null&&fp.next!=null)
        {
            sp=sp.next;
            fp=fp.next.next;
        }
        ListNode sec=reverse(sp);
        while(sec!=null)
        {
            sum=0;
            sum+=trav.val+sec.val;
            max=Math.max(sum,max);
            sec=sec.next;
            trav=trav.next;

        }
        return max;
    }
    ListNode reverse(ListNode head)
    {
        ListNode curr=head;
        ListNode next=null;
        ListNode prev=null;
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
        MaximumTwinSumOfLL obj= new MaximumTwinSumOfLL();
        obj.head=new ListNode(5);
        ListNode first=new ListNode(4);
        ListNode second=new ListNode(2);
        ListNode third=new ListNode(1);
        obj.head.next=first;
        first.next=second;
        second.next=third;
        System.out.println("Given LL:");
        printList(obj.head);
        System.out.println("After finding the result:");
        int ans=obj.pairSum(obj.head);
        System.out.println(ans);
    }

}
