package org.example.LeetCodeDSA;

import java.util.Stack;

public class RemoveAdjacentDuplicates {
    public String removeDuplicates(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(stack.isEmpty())
            {
                stack.push(c);
            }
            else
            {
                if(!stack.isEmpty()&&stack.peek()==c)
                {
                    stack.pop();
                }
                else
                {
                    stack.push(c);
                }
            }
        }
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();

    }

    public static void main(String[] args) {
        RemoveAdjacentDuplicates obj=new RemoveAdjacentDuplicates();
        String s="abbaca";
        System.out.println(obj.removeDuplicates(s));
    }
}
