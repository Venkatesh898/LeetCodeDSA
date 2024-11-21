package org.example.LeetCodeDSA.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node
{
    int data;
    Node left;
    Node right;
    public Node(int data)
    {
        this.data=data;
    }
}

public class LeftViewOfBT {

        ArrayList<Integer> leftView(Node root) {

            // code here
            ArrayList<Integer> res=new ArrayList<>();
            if(root==null)
            {
                return res;
            }
            Queue<Node> queue =new LinkedList<>();
            queue.offer(root);
            while(!queue.isEmpty())
            {
                int levelSize=queue.size();
                for(int i=0;i<levelSize;i++)
                {
                    Node curr=queue.poll();
                    if(i==0)
                    {
                        res.add(curr.data);
                    }
                    if(curr.left!=null)
                    {
                        queue.offer(curr.left);
                    }
                    if(curr.right!=null)
                    {
                        queue.offer(curr.right);
                    }
                }
            }
            return res;


    }
}
