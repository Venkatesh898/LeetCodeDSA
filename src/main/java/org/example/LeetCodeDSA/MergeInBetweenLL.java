package org.example.LeetCodeDSA;

public class MergeInBetweenLL {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode first=null, last=null;
        int count=0;
        ListNode curr=list1;
        ListNode prev=null;
        while(curr!=null)
        {
            prev=curr;
            curr=curr.next;
            count++;
            if(count==a)
            {
                first=prev;

            }
            if(count==b)
            {
                last=prev;
                break;
            }
        }
        ListNode temp=list2;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=curr.next;
        first.next=list2;
        return list1;


    }

}
