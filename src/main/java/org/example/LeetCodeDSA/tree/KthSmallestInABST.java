package org.example.LeetCodeDSA.tree;

import java.util.ArrayList;

public class KthSmallestInABST {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> list = inOrder(root, new ArrayList<>());
        return list.get(k - 1);
 }
   ArrayList<Integer> inOrder(TreeNode root, ArrayList<Integer> list) {
        if (root == null)
            return list;

        list = inOrder(root.left, list);
        list.add(root.val);
        list = inOrder(root.right, list);
        return list;
    }
}
