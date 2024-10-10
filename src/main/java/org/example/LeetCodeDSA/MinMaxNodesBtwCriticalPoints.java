package org.example.LeetCodeDSA;

public class MinMaxNodesBtwCriticalPoints {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null||head.next==null||head.next.next==null)
        {
            return new int[]{-1,-1};
        }
        int min=Integer.MAX_VALUE,count=2,criticalPoint=0,first=0;
        ListNode curr=head.next;
        ListNode prev=head;
        while(curr.next!=null)
        {
            if((curr.val>prev.val&&curr.val>curr.next.val)||(curr.val<prev.val&&curr.val<curr.next.val))
            {
                if(first==0)
                {
                    first=count;
                }
                if(criticalPoint!=0)
                {
                    min=Math.min(min,count-criticalPoint);
                }
                criticalPoint=count;
            }
            count++;
            prev=curr;
            curr=curr.next;
        }
        if(criticalPoint==0||(min-Integer.MAX_VALUE==0))
        {
            return new int[]{-1,-1};
        }
        return new int[]{min,criticalPoint-first};


    }
}
