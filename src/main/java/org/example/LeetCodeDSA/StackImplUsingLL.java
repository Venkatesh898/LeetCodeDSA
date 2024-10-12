package org.example.LeetCodeDSA;

public class StackImplUsingLL {
    private class Node{
      int val;
      Node next;
      public Node(int val)
      {
         this.val=val;
      }

    }
    Node head;
    void push(int val)
    {
        if(head==null)
        {
            head=new Node(val);
        }
        else {
            Node newNode=new Node(val);
            newNode.next=head;
            head=newNode;
        }
    }
    void pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty!!");
        }
        else {
            int value = head.val;
            head = head.next;
            System.out.println("Removed value is :" + value);
        }
    }

    private boolean isEmpty() {
        return head==null;
    }

    int peek()
    {
        if(isEmpty())
        {
            throw new ArrayIndexOutOfBoundsException("Stack is Empty!!");

        }

            return head.val;

    }

    public static void main(String[] args) {
        StackImplUsingLL stack=new StackImplUsingLL();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
    }
}
