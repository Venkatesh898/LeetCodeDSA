package org.example.LeetCodeDSA.tree;

import java.util.ArrayList;
import java.util.Stack;

public class IterativePostOrder {
    class Node {
        int data;
        Node left, right;
        Node(int item)    {
            data = item;
            left = right = null;
        }
    }
    ArrayList<Integer> postOrder(Node root) {
        // Your code goes here
        ArrayList<Integer> ans=new ArrayList<Integer>();
        Stack<Node> st=new Stack<>();
        Node curr=root;
        while(curr!=null||! st.isEmpty())
        {
            if(curr!=null)
            {
                st.push(curr);
                curr=curr.left;
            }
            else
            {
                Node temp=st.peek().right;
                if(temp==null)
                {
                    temp=st.pop();
                    ans.add(temp.data);
                    while(!st.isEmpty()&&temp==st.peek().right)
                    {
                        temp=st.pop();
                        ans.add(temp.data);
                    }

                }
                else
                {
                    curr=temp;
                }
            }
        }
        return ans;
    }
}
