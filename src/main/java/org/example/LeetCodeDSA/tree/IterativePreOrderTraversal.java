package org.example.LeetCodeDSA.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativePreOrderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null)
        {
            return new ArrayList<>();
        }
        List<Integer> ans =new ArrayList<>();
        Stack<TreeNode> stack =new Stack<>();
        stack.push(root);
        while(!stack.isEmpty())
        {
            TreeNode temp=stack.pop();
            ans.add(temp.val);
            if(temp.right!=null)
            {
                stack.push(temp.right);
            }
            if(temp.left!=null)
            {
                stack.push(temp.left);
            }
        }
        return ans;
    }
}
