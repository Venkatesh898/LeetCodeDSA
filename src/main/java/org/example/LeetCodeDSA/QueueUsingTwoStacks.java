package org.example.LeetCodeDSA;

import java.util.Stack;

class QueueUsingTwoStacks {
    Stack<Integer> stack1;
    Stack<Integer>stack2;


    public QueueUsingTwoStacks() {
        stack1=new Stack<>();
        stack2=new Stack<>();

    }

    public void push(int x) {
        if(stack1.isEmpty()&&stack2.isEmpty())
        {
            stack1.push(x);
        }
        else
        {
            while(!stack1.isEmpty())
            {
                stack2.push(stack1.peek());
                stack1.pop();
            }
            stack1.push(x);
            while(!stack2.isEmpty())
            {
                stack1.push(stack2.peek());
                stack2.pop();
            }

        }
    }

    public int pop() {
        return stack1.pop();
    }

    public int peek() {
        return stack1.peek();
    }

    public boolean empty() {
        return stack1.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks queue=new QueueUsingTwoStacks();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.empty());
    }
}