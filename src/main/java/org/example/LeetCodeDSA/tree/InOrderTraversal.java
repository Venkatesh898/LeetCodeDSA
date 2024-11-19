package org.example.LeetCodeDSA.tree;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        return trav(root, new ArrayList<>());
    }

    List<Integer> trav(TreeNode root, List<Integer> al) {
        if (root == null)
            return al;

        al = trav(root.left, al);
        al.add(root.val);
        al = trav(root.right, al);

        return al;
    }
}
