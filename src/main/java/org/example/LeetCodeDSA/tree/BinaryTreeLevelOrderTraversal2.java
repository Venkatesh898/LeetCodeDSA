package org.example.LeetCodeDSA.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal2 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result= new ArrayList<>();
        if(root==null)
    {
        return result;
    }
    Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
    {
        List<Integer>levelList =new ArrayList<>(queue.size());
        int levelSize=queue.size();
        for(int i=0;i<levelSize;i++)
        {
            TreeNode currLevel=queue.poll();
            levelList.add(currLevel.val);
            if(currLevel.left!=null)
            {
                queue.offer(currLevel.left);
            }
            if(currLevel.right!=null)
            {
                queue.offer(currLevel.right);
            }

        }
        result.add(0,levelList);
    }
        return result;

}
}
