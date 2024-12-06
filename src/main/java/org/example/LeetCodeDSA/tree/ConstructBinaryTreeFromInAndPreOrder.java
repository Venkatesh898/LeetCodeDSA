package org.example.LeetCodeDSA.tree;

import java.util.HashMap;

public class ConstructBinaryTreeFromInAndPreOrder {
    int index=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }
        return traverse(preorder, inorder, 0, inorder.length - 1,map);
    }

    private TreeNode traverse(int[] preorder, int[] inorder, int st, int end,HashMap<Integer,Integer> map ) {
        if (st > end) {
            return null;
        }
        int current=preorder[index++];
        int inOrderIndex=map.get(current);
        TreeNode root = new TreeNode(current);
        if(st==end)
        {
            return root;
        }

        root.left = traverse(preorder, inorder, st, inOrderIndex - 1, map);
        root.right = traverse(preorder, inorder, inOrderIndex + 1, end, map);

        return root;
    }
}
