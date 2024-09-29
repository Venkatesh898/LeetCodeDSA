package org.example.LeetCodeDSA;

public class MergeTwoSortedLL {
    Node head1;
    Node head2;
    static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
        }
    }
    public static void  printList(Node head)
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+" ->");
            curr=curr.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static  Node mergeTwoLists(Node list1, Node list2) {
        Node dummy=new Node(0);
        Node tail=dummy;
        while(list1!=null&&list2!=null)
        {
            if(list1.data<=list2.data)
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
        MergeTwoSortedLL mergeTwoSortedLL=new MergeTwoSortedLL();
        mergeTwoSortedLL.head1=new Node(1);
        Node first1 =new Node(2);
        Node second1=new Node(4);
        mergeTwoSortedLL.head1.next=first1;
        first1.next=second1;
        printList(mergeTwoSortedLL.head1);

        mergeTwoSortedLL.head2=new Node(1);
        Node first2 =new Node(3);
        Node second2=new Node(4);
        mergeTwoSortedLL.head2.next=first2;
        first2.next=second2;
        printList(mergeTwoSortedLL.head2);
        Node head=mergeTwoLists(mergeTwoSortedLL.head1,mergeTwoSortedLL.head2);
        printList(head);




    }
}
