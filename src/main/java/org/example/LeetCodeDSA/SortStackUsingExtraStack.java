package org.example.LeetCodeDSA;

import java.util.Stack;

public class SortStackUsingExtraStack {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        Stack<Integer>temp=new Stack();
        while(!s.isEmpty())
        {
            int t1=s.pop();
            if(temp.isEmpty())
            {
                temp.push(t1);
            }
            else
            {
                if(temp.peek()>t1)
                {
                    while(!temp.isEmpty()&&temp.peek()>t1)
                    {
                        s.push(temp.pop());
                    }
                    temp.push(t1);
                }
                else
                {
                    temp.push(t1);
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        SortStackUsingExtraStack obj=new SortStackUsingExtraStack();
        Stack<Integer> temp=new Stack();
        temp.push(1);temp.push(2);
        temp.push(3);
        Stack<Integer>ans=obj.sort(temp);
        for(int i: ans)
        System.out.println(i);

    }
}
