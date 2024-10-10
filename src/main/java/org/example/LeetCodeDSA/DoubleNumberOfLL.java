package org.example.LeetCodeDSA;

public class DoubleNumberOfLL {
    public ListNode doubleIt(ListNode head) {
        ListNode curr1=reverse(head);
        ListNode prev=null;
        ListNode head1=curr1;
        int carry=0;
        while(curr1!=null)
        {
            int val=curr1.val*2;
            val+=carry;
            curr1.val=val%10;
            carry=val/10;
            prev=curr1;
            curr1=curr1.next;
        }
        if(carry==1)
        {
            prev.next=new ListNode(1);
        }
        return reverse(head1);
    }
    ListNode reverse(ListNode head)
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
}
