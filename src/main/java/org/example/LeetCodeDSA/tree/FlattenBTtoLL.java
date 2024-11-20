package org.example.LeetCodeDSA.tree;

public class FlattenBTtoLL {
    public void flatten(TreeNode root) {
        TreeNode curr=root;
        while(curr!=null)
        {
            TreeNode temp=curr.left;
            if(curr.left!=null)
            {
                while(temp.right!=null)
                {
                    temp=temp.right;
                }
                temp.right=curr.right;
                curr.right=curr.left;
                curr.left=null;
            }
            curr=curr.right;
        }
    }
}
