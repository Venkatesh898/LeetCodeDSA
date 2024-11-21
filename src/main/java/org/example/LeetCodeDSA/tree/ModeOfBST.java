package org.example.LeetCodeDSA.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ModeOfBST {
    Map<Integer,Integer> map=new HashMap<>();
    int max=0;
    public int[] findMode(TreeNode root) {
        if (root==null)
        {
            return new int[]{0};
        }
        helper(root);
        ArrayList<Integer> al=new ArrayList<>();

        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            if(entry.getValue()==max)
            {

                al.add(entry.getKey());
            }
        }
        int res[]=new int[al.size()];
        for(int i=0;i<res.length;i++)
        {
            res[i]=al.get(i);
        }
        return res;
    }
    void  helper(TreeNode root)
    {
        if(root==null)
        {
            return ;
        }
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        max=Math.max(map.get(root.val),max);
        helper(root.left);
        helper(root.right);
    }
}
