package org.example.LeetCodeDSA;

import java.util.Stack;

public class LongestValidParanthesis {

        public int longestValidParentheses(String s) {
            if(s==null||s.length()<2)
                return 0;
            Stack<Integer> stack=new Stack<>();
            for(int i=0;i<s.length();i++)
            {
                char c=s.charAt(i);
                if(c=='(')
                {
                    stack.push(i);
                }
                else
                {
                    if(!stack.isEmpty()&&s.charAt(stack.peek())=='(')
                    {
                        stack.pop();
                    }
                    else
                    {
                        stack.push(i);
                    }
                }
            }
            int max=-1;
            int end=s.length();
            while(!stack.isEmpty())
            {
                int start=stack.pop();
                max=Math.max(max,end-start-1);
                end=start;
            }
            return Math.max(max,end);

        }

    public static void main(String[] args) {
        LongestValidParanthesis obj=new LongestValidParanthesis();
        String val="(())(((())))";
        System.out.println(obj.longestValidParentheses(val));
    }
}

