package org.example.LeetCodeDSA.tree;

import java.util.List;
import java.util.Stack;

public class IterativeInorder {
    public static void main(String[] args) {
        TreeNode root= new TreeNode(3);
        root.left=new TreeNode(9);
        root.right= new TreeNode(20);
        root.left.left=new TreeNode(15);
        root.left.right=new TreeNode(7);
        root.right.left=new TreeNode(30);
        root.right.right=new TreeNode(5);
        IterativeInorder obj =new IterativeInorder();
        obj.inOrderTraversal(root);
    }
    void inOrderTraversal(TreeNode root)
    {
        Stack<TreeNode> st =new Stack<>();
        TreeNode curr=root;

        while(curr!=null|| !st.isEmpty())
        {
           while(curr!=null)
           {
               st.push(curr);
               curr=curr.left;
           }
           TreeNode temp=st.pop();
           System.out.println(temp.val);
           curr=temp.right;

        }
    }


}
