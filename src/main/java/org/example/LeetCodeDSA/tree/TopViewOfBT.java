package org.example.LeetCodeDSA.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

class Pair
{
    private Node k;
    private Integer v;
    public Pair(Node k, Integer v)
    {
        this.k=k;
        this.v=v;
    }
    public Node getKey()
    {
        return k;
    }
    public Integer getValue()
    {
        return v;
    }
}public class TopViewOfBT {
    static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> res= new ArrayList<>();
        if(root==null)
        {
            return res;
        }
        TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<Pair> queue=new LinkedList<>();
        queue.offer(new Pair(root,0));
        while(!queue.isEmpty())
        {
            Pair p=queue.poll();
            Node n=p.getKey();
            int hd=p.getValue();
            if(!map.containsKey(hd))
            {
                map.put(hd,n.data);
            }
            if(n.left!=null)
            {
                queue.add(new Pair(n.left,hd-1));
            }
            if(n.right!=null)
            {
                queue.add(new Pair(n.right,hd+1));
            }
        }
        for(int key:map.keySet())
        {
            res.add(map.get(key));
        }
        return res;
    }
}
