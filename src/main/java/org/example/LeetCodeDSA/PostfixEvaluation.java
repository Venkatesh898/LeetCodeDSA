package org.example.LeetCodeDSA;

import java.util.Stack;

public class PostfixEvaluation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        int a,b;
        for(int i=0;i<tokens.length;i++)
        {
            switch(tokens[i])
            {
                case "+":
                    b=stack.pop();
                    a=stack.pop();
                    stack.push(a+b);
                    break;
                case "-":
                    b=stack.pop();
                    a=stack.pop();
                    stack.push(a-b);
                    break;
                case "*":
                    b=stack.pop();
                    a=stack.pop();
                    stack.push(a*b);
                    break;
                case "/":
                    b=stack.pop();
                    a=stack.pop();
                    stack.push(a/b);
                    break;
                default:
                    stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();

    }

    public static void main(String[] args) {
        PostfixEvaluation obj= new PostfixEvaluation();
        String st[]={"4","13","5","/","+"};
        System.out.println(obj.evalRPN(st));
    }
}
