package org.example.LeetCodeDSA;

import java.util.HashSet;
import java.util.Set;

public class DeleteNodesFromLLInArray {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set=new HashSet<>();
        for(int val:nums)
            set.add(val);
        ListNode curr=head;
        ListNode nextNode;
        ListNode prev=null;
        while(curr!=null)
        {

            nextNode=curr.next;
            if(set.contains(curr.val))
            {
                if(curr==head)
                {
                    curr.next=null;
                    curr=nextNode;
                    head=curr;

                }
                else
                {
                    prev.next=nextNode;
                    curr.next=null;
                    curr=nextNode;

                }
            }
            else
            {
                prev=curr;
                curr=curr.next;
            }


        }
        return head;


    }
}
