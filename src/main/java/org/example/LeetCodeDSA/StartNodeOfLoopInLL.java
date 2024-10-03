package org.example.LeetCodeDSA;
//floyd cycle detection.

public class StartNodeOfLoopInLL {
    ListNode head;
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode detectCycle(ListNode head) {
        ListNode fp=head;
        ListNode sp=head;
        while(fp!=null&&fp.next!=null)
        {
            sp=sp.next;
            fp=fp.next.next;
            if(sp==fp)
            {
                return start(sp,head);
            }

        }
        return null;

    }
    public static ListNode start(ListNode start1,ListNode head)
    {
        ListNode temp=head;
        while(temp!=start1)
        {
            temp=temp.next;
            start1=start1.next;
        }

        return start1;
    }

    public static void main(String[] args) {
        StartNodeOfLoopInLL startNodeOfLoopInLL=new StartNodeOfLoopInLL();
        startNodeOfLoopInLL.head=new ListNode(3);
        ListNode first=new ListNode(2);
        ListNode second=new ListNode(0);
        ListNode third=new ListNode(4);
        third.next=second;
        startNodeOfLoopInLL.head.next=first;
        first.next=second;
        second.next=third;
       ListNode ans= detectCycle(startNodeOfLoopInLL.head);
       System.out.println(ans.val);

    }
}
