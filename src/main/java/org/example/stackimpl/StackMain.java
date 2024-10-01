package org.example.stackimpl;

public class StackMain {
    public static void main(String[] args) {
        CustomStack stack=new CustomStack(5);
        stack.push(10);
        stack.push(15);
        stack.push(30);
        System.out.println(stack.peek());
        stack.push(40);
        System.out.println(stack.pop());
        stack.push(24);
        System.out.println(stack.peek());

    }
}
