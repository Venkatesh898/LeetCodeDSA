package org.example.LeetCodeDSA;

import java.util.HashMap;

public class LRUCache {
    HashMap<Integer,Node> hm=new HashMap<>();
    Node head=new Node(0,0);
    Node tail=new Node(0,0);
    int capacity;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;

    }

    public int get(int key) {
        if(hm.containsKey(key))
        {
            Node node=hm.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        else
            return -1;

    }

    public void put(int key, int value) {
        if(hm.containsKey(key))
        {
            Node node1=hm.get(key);
            remove(node1);

        }
        if(hm.size()==capacity)
        {
            remove(tail.prev);
        }
        insert(new Node(key,value));

    }
    public void insert(Node node)
    {
        hm.put(node.key,node);
        Node headNext=head.next;
        head.next=node;
        node.prev=head;
        headNext.prev=node;
        node.next=headNext;
    }
    public void remove(Node node)
    {
        hm.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    class Node
    {
        int key,val;
        Node prev,next;
        public Node(int key,int val)
        {
            this.key=key;
            this.val=val;
        }
    }

    public static void main(String[] args) {
        LRUCache cache=new LRUCache(2);
        cache.put(1,1);
        cache.put(2,5);
        cache.put(3,6);
        cache.put(4,7);
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
    }
}

