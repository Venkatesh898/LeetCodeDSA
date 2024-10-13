package org.example.LeetCodeDSA;

public class QueueImplementationUsingLL {
    private ListNode front,rear;
    int length;
    private  class ListNode
    {
        int data;
        ListNode next;
        public  ListNode(int data)
        {
            this.data=data;
            next=null;
        }
    }
    int length()
    {
        return  length;
    }
    public  void enqueue(int val)
    {
        ListNode temp=new ListNode(val);
        if(isEmpty())
        {
           front =temp;
        }
        else
        {
            rear.next=temp;
        }
        rear=temp;
        length++;
    }
    public  int dequeue()
    {
        if(isEmpty())
        {
           throw new IllegalArgumentException("Queue is Empty!!");
        }
        int val= front.data;
        front=front.next;
        length--;
        return val;
    }

    private boolean isEmpty() {
        return  length==0;
    }

    public static void main(String[] args) {
        QueueImplementationUsingLL queue=new QueueImplementationUsingLL();
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println(queue.dequeue());
        queue.dequeue();
        System.out.println(queue.dequeue());
        //queue.dequeue();

    }
}
