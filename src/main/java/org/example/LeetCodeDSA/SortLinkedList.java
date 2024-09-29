package org.example.LeetCodeDSA;
 class ListNode {
      int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class SortLinkedList {
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode mid =middleNode(head);
        ListNode rightHead=mid.next;
        mid.next=null;
        ListNode leftHead=sortList(head);
        ListNode rightPart=sortList(rightHead);
        return  mergeTwoLists(leftHead,rightPart);

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
    public ListNode middleNode(ListNode head) {
        ListNode sp=head,fp=head.next;
        while(fp!=null&&fp.next!=null)
        {
            sp=sp.next;
            fp=fp.next.next;
        }
        return sp;

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
        SortLinkedList sll=new SortLinkedList();
        ListNode head=new ListNode(4);
        ListNode first=new ListNode(2);
        ListNode second=new ListNode(1);
        ListNode third=new ListNode(3);
        head.next=first;
        first.next=second;
        second.next=third;
        System.out.println("Before Sorting the LL:");
        printList(head);
        ListNode ans=sll.sortList(head);
        System.out.println("After Sorting the LL:");
        printList(ans);

    }
}
