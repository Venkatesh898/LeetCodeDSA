package org.example.LeetCodeDSA.tree;

public class SearchaNodeInBST {
    boolean search(Node root, int x) {
        // Your code here
        if(root==null)
        {
            return false;
        }
        if(root.data==x)
        {
            return true;
        }
        if(root.data>x)
        {
            return search(root.left,x);
        }
        else
            return search(root.right,x);

    }
}
