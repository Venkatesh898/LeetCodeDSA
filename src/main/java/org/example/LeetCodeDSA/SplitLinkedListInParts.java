package org.example.LeetCodeDSA;

import java.util.Arrays;

public class SplitLinkedListInParts {
    ListNode head;

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ->");
            curr = curr.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len=lengthOfList(head);
        ListNode ans[]=new ListNode[k];
        if(len<k)
        {
            ListNode curr=head;
            int i=0;
            while(curr!=null)
            {
                curr=head.next;
                head.next=null;
                ans[i++]=head;

                head=curr;


            }
            return ans;
        }
        else
        {
            int n=len/k;
            int rem=len%k;
            int it=0;
            while(it<k)
            {
                int internalptr=n;
                if(rem>0)
                {
                    internalptr+=1;
                    rem--;

                }
                int p=0;
                ListNode prev=head,curr1=head;
                while(p<internalptr)
                {
                    prev=curr1;
                    curr1=curr1.next;
                    p++;
                }
                prev.next=null;
                ans[it++]=head;
                head=curr1;

            }
            return ans;
        }

    }
    int lengthOfList(ListNode head)
    {
        ListNode curr=head;
        int count=0;
        while(curr!=null)
        {
            curr=curr.next;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        SplitLinkedListInParts obj=new SplitLinkedListInParts();
        obj.head=new ListNode(1);
        ListNode first =new ListNode(2);
        ListNode second=new ListNode(3);
        obj.head.next=first;
        first.next=second;
        printList(obj.head);
        ListNode ans[]=obj.splitListToParts(obj.head,2);
        System.out.println(Arrays.toString(ans));

    }
}
