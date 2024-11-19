package org.example.LeetCodeDSA.tree;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        return trav(root,new ArrayList<Integer>());


    }
    List<Integer> trav(TreeNode root, List<Integer> al){
        if (root == null)
            return al;

        al.add(root.val);
        al = trav(root.left, al);
        al = trav(root.right, al);

        return al;
    }
}
