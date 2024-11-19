package org.example.LeetCodeDSA.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfABinaryTree {
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        Queue<TreeNode> queue =new LinkedList<>();
        int ans=0;
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int levelSize=queue.size();

            for(int i=0;i<levelSize;i++)
            {
                TreeNode currLevel=queue.poll();
                if(currLevel.left!=null)
                {
                    queue.offer(currLevel.left);
                }
                if(currLevel.right!=null)
                {
                    queue.offer(currLevel.right);
                }
            }
            ans++;
        }
        return ans;

    }
}
