package org.example.LeetCodeDSA.tree;

import java.util.ArrayList;
import java.util.List;

public class RIghtViewOfBTUsingRecursion {
    List<Integer> ans =new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null)
        {
            return ans;
        }
        rsv(root, 0);
        return ans;
    }
    public void rsv(TreeNode root, int level)
    {
        if(root==null)
        {
            return ;
        }
        if(level==ans.size())
        {
            ans.add(root.val);
        }
        rsv(root.right,level+1);
        rsv(root.left,level+1);
    }
}
