package org.example.LeetCodeDSA;

public class LinkedListCycle {
    Node head;
    static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
        }
    }
    public static boolean isCycleExists(Node head)
    {
        Node sp=head;
        Node fp=head;
        while (fp!=null&&fp.next!=null)
        {
            sp=sp.next;
            fp=fp.next.next;
            if(sp==fp)
            {
                return  true;
            }
        }
        return  false;
    }
    public static void main(String[] args) {
        LinkedListCycle cycle=new LinkedListCycle();
        cycle.head=new Node(1);
        Node first=new Node(2);
        Node second=new Node(3);
        Node third=new Node(4);
        cycle.head.next=first;
        first.next=second;
        second.next=third;
        third.next=cycle.head;
        System.out.println(isCycleExists(cycle.head));
    }

}
