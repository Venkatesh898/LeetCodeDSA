package org.example.LeetCodeDSA;

import java.util.Stack;

class MinStack {
    Stack<Integer> s;
    Stack<Integer>ss;

    public MinStack() {
        s=new Stack<>();
        ss=new Stack<>();
    }

    public void push(int val) {
        if(ss.isEmpty()||val<=ss.peek())
        {
            ss.push(val);
        }
        s.push(val);

    }

    public void pop() {
        if(s.isEmpty())
        {
            return ;
        }
        if(s.peek().equals(ss.peek()))
        {
            ss.pop();
        }
        s.pop();
    }

    public int top() {
        return s.peek();

    }

    public int getMin() {
        if(ss.isEmpty())
        {
            return -1;

        }
        return ss.peek();
    }

    public static void main(String[] args) {
        MinStack minStack=new MinStack();
        minStack.push(-1);
        minStack.push(0);
        System.out.println(minStack.getMin());
    }
}

