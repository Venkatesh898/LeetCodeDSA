package org.example.LeetCodeDSA.tree;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
        {
            return null;
        }
        TreeNode lh=invertTree(root.left);
        TreeNode rh=invertTree(root.right);
        root.left=rh;
        root.right=lh;
        return root;
    }
}
