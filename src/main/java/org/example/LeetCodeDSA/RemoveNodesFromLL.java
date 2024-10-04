package org.example.LeetCodeDSA;

public class RemoveNodesFromLL {
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
    public ListNode removeNodes(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode  head1=reverseNodes(head);
        ListNode curr=head1;
        int max=head1.val;
        while(curr.next!=null)
        {
            if(curr.next.val>=max)
            {
                max=curr.next.val;
                curr=curr.next;
            }
            else
            {
                curr.next=curr.next.next;
            }
        }
        return reverseNodes(head1);



    }
    public ListNode reverseNodes(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        RemoveNodesFromLL rm=new RemoveNodesFromLL();
        rm.head=new ListNode(5);
        ListNode first=new ListNode(2);
        ListNode second=new ListNode(13);
        ListNode third=new ListNode(3);
        ListNode fourth=new ListNode(8);
        rm.head.next=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        System.out.println("given LL:");
        printList(rm.head);
        ListNode ans=rm.removeNodes(rm.head);
        System.out.println("After removal of nodes:");
        printList(ans);
    }
}
