package org.example.LeetCodeDSA;

public class CircularQueuueImplUsingArray {
    int arr[];
    int size;
    int front,rear;
    public  CircularQueuueImplUsingArray(int size)
    {
        arr=new int[size];
        this.size=size;
        front=-1;
        rear=-1;
    }
    private void push(int val)
    {
        if(isFull())
        {
            throw  new IllegalArgumentException("Queue is Full!!");
        }
        if(front==-1)
        {
            front=0;
        }
        rear=(rear+1)%size;
        arr[rear]=val;
    }
    private int pop()
    {
        if(isEmpty())
        {
            throw new IllegalArgumentException("Queue is Empty!!");
        }
        int value = arr[front];

        if(rear==front)
        {
            front=-1;
            rear=-1;
        }
        else {
            front = (front + 1) % size;

        }
        return value;
    }
    boolean isEmpty()
    {
        return front==-1&&rear==-1;
    }
    boolean isFull()
    {
        return (rear+1)%size==front;
    }

    public static void main(String[] args) {
        CircularQueuueImplUsingArray cq=new CircularQueuueImplUsingArray(3);
        cq.push(1);
        cq.push(2);
        cq.push(3);
        System.out.println(cq.pop());
        cq.push(4);
        while (!cq.isEmpty())
        {
            System.out.println(cq.pop());
        }
    }
}
