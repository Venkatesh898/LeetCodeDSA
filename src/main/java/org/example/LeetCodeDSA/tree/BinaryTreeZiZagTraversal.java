package org.example.LeetCodeDSA.tree;

import java.util.*;

public class BinaryTreeZiZagTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null)
        {
            return new ArrayList<>();
        }
        List<List<Integer>>result=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int numberOfLevels=0;
        while(!queue.isEmpty())
        {
            List<Integer>level=new ArrayList<>(queue.size());
            int levelSize=queue.size();
            for(int i=0;i<levelSize;i++)
            {
                TreeNode currLevel=queue.poll();
                level.add(currLevel.val);
                if(currLevel.left!=null)
                {
                    queue.offer(currLevel.left);
                }
                if(currLevel.right!=null)
                {
                    queue.offer(currLevel.right);
                }
            }
            if(numberOfLevels%2!=0)
            {
                Collections.reverse(level);
            }
            result.add(level);
            numberOfLevels++;

        }
        return result;

    }
}
