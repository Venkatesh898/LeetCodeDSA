package org.example.LeetCodeDSA.tree;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        if(root==null)
        {
            return true;
        }
        if(root.left==null&&root.right==null)
        {
            return true;
        }
        return helper(root,Long.MIN_VALUE,Long.MAX_VALUE);


    }
    boolean helper(TreeNode root, long min, long max)
    {
        if(root==null)
        {
            return true;
        }
        if(root.val<=min|| root.val>=max)
        {
            return false;
        }
        boolean left=helper(root.left,min,root.val);
        if(left)
        {
            boolean right=helper(root.right,root.val,max);
            return right;
        }
        return false;
    }
}
