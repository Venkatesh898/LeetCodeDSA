package org.example.LeetCodeDSA;

public class QueueUsingArray {
    int size;
    int arr[];
    int front,rear;
    public QueueUsingArray(int size)
    {
        arr=new int[size];
        this.size=size;
        front=0;
        rear=-1;
    }
    private void  add(int val)
    {
        if(rear==size-1)
        {
            System.out.println("Queue is Full!!");
            return;
        }
        rear++;
        arr[rear]=val;
    }
    private int remove ()
    {

        if(isEmpty())
        {
            throw new IllegalArgumentException("Queue is Empty!!");
        }

            int value=arr[0];
            for(int i=0;i<rear;i++)
            {
                arr[i]=arr[i+1];
            }
            rear--;
            return  value;

    }
    int peek()
    {
        if(isEmpty())
        {
            throw new IllegalArgumentException("Queue is Empty!!");
        }
        return arr[0];
    }

    private boolean isEmpty() {
        return rear==-1;
    }

    public static void main(String[] args) {
        QueueUsingArray queue=new QueueUsingArray(4);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        while (!queue.isEmpty())
        {
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
