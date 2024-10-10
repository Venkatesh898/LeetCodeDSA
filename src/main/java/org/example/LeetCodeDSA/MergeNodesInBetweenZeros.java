package org.example.LeetCodeDSA;

public class MergeNodesInBetweenZeros {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy1=new ListNode(0);
        ListNode dummy=dummy1;
        ListNode curr=head.next;
        while(curr!=null)
        {
            int sum=0;
            while(curr.val!=0)
            {
                sum+=curr.val;
                curr=curr.next;
            }
            dummy.next=new ListNode(sum);
            dummy=dummy.next;
            curr=curr.next;
        }
        return dummy1.next;

    }
}
