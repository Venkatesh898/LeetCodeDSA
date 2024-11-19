package org.example.LeetCodeDSA.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FindBootomLeftTreeValue {
    public int findBottomLeftValue(TreeNode root) {
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer>ll=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=q.remove();
                ll.add(node.val);
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            list.add(ll);
        }
        return list.get(list.size()-1).get(0);
    }
}
