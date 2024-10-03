package org.example.LeetCodeDSA;

public class ReverseLinkedList2 {
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

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null || left == right) {
            return head;
        }
        int count = 1;
        ListNode curr = head;
        ListNode prev1 = null;
        ListNode dummy = new ListNode(0);

        while (count < left) {
            prev1 = curr;
            curr = curr.next;
            count++;
        }
        ListNode arr[] = reverse(curr, right - left + 1);

        if (left == 1) {
            dummy.next = arr[0];
        } else {
            prev1.next = arr[0];
        }

        curr.next = arr[1];
        if (left == 1) {
            return dummy.next;
        }
        return head;

    }

    ListNode[] reverse(ListNode head, int it) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        int count = 1;
        while (count <= it) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;

        }
        return new ListNode[]{prev, next};
    }

    public static void main(String[] args) {
        ReverseLinkedList2 rll = new ReverseLinkedList2();
        rll.head = new ListNode(1);
        ListNode first = new ListNode(2);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(5);
        rll.head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        printList(rll.head);
        ListNode ans = rll.reverseBetween(rll.head, 1, 5);
        System.out.println("after transformation:");
        printList(ans);
    }
}
