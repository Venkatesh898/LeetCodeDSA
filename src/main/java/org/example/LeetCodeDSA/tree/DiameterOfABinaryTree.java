package org.example.LeetCodeDSA.tree;

public class DiameterOfABinaryTree {
    int ans=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return ans;
    }
    private int height(TreeNode root)
    {
        if(root==null)
            return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        ans=Math.max(ans,lh+rh);
        return 1+Math.max(lh,rh);
    }
}
