package org.example.LeetCodeDSA;

public class DeleteMiddleNodeOfALL {
    ListNode head;
    static class ListNode {
        int val;
        ListNode  next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode deleteMiddle(ListNode head) {
        if(head==null||head.next==null)
            return null;
        if(head.next.next==null)
        {
            head.next=null;
            return head;
        }
        ListNode prev=midNode(head);
        prev.next=prev.next.next;
        return head;

    }
    ListNode midNode(ListNode head)
    {
        ListNode sp=head,fp=head,prev=null;
        while(fp!=null&&fp.next!=null)
        {
            prev=sp;
            sp=sp.next;
            fp=fp.next.next;
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
        DeleteMiddleNodeOfALL node=new DeleteMiddleNodeOfALL();
        node.head=new ListNode(1);
        ListNode first=new ListNode(2);
        ListNode second=new ListNode(3);
        ListNode third=new ListNode(4);
        ListNode fourth=new ListNode(5);
        node.head.next=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        System.out.println("given LL:");
        printList(node.head);
        System.out.println("After removal of the mid node:");
        ListNode ans=node.deleteMiddle(node.head);
        printList(ans);

    }
}
