package org.example.LeetCodeDSA;

public class MergeKSortedLists {
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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
        {
            return null;
        }
        if(lists.length==1)
        {
            return lists[0];
        }
        ListNode itr=mergeTwoLists(lists[0],lists[1]);

        for(int i=2;i<lists.length;i++)
        {
            itr=mergeTwoLists(itr,lists[i]);
        }
        return itr;


    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        while(list1!=null&&list2!=null)
        {
            if(list1.val<=list2.val)
            {
                tail.next=list1;
                list1=list1.next;
            }
            else
            {
                tail.next=list2;
                list2=list2.next;
            }
            tail=tail.next;
        }
        if(list1==null)
        {
            tail.next=list2;
        }
        if(list2==null)
        {
            tail.next=list1;
        }
        return dummy.next;

    }

    public static void main(String[] args) {
        MergeKSortedLists obj=new MergeKSortedLists();
        ListNode arr[]=new ListNode[3];
        ListNode head1=new ListNode(1);
        head1.next=new ListNode(4);
        head1.next.next=new ListNode(5);
        arr[0]=head1;
        ListNode head2=new ListNode(1);
        head2.next=new ListNode(3);
        head2.next.next=new ListNode(4);
        arr[1]=head2;
        ListNode head3=new ListNode(2);
        head3.next=new ListNode(6);
        arr[2]=head3;
        ListNode ans=obj.mergeKLists(arr);
        printList(ans);
    }
}
