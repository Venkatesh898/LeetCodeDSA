package org.example.LeetCodeDSA.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if(root==null)
        {
            return list;
        }
        Queue<TreeNode> queue =new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int levelSize=queue.size();
            for(int i=0;i<levelSize;i++)
            {
                TreeNode currLevel=queue.poll();
                if(i==levelSize-1)
                {
                    list.add(currLevel.val);
                }
                if(currLevel.left!=null)
                {
                    queue.offer(currLevel.left);
                }
                if(currLevel.right!=null)
                {
                    queue.offer(currLevel.right);
                }
            }
        }
        return list;

    }
}
