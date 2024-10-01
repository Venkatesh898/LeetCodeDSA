package org.example.stackimpl;

public class CustomStack {
     int[]data;
     private static final int DEFAULT_SIZE=10;
     public CustomStack()
     {
         this(DEFAULT_SIZE);
     }
     public  CustomStack(int size)
     {
         data=new int[size];
     }
     int ptr=-1;
     public boolean push(int item)
     {
         if(isFull())
         {
             throw  new StackException("Stack is full!!");
         }
         data[++ptr]=item;
         return true;
     }
     public int pop()
     {
         if(isEmpty())
         {
             throw  new StackException("Stack is Empty!!");
         }
         return data[ptr--];
     }
     public int peek()
     {
         if(isEmpty())
         {
             throw  new StackException("Stack is Empty!!");
         }
         return data[ptr];
     }

    private boolean isEmpty() {
         return ptr==-1;
    }

    private boolean isFull() {
         return ptr==data.length-1;
    }

}
