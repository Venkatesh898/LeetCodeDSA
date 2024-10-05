package org.example.LeetCodeDSA;

import java.util.HashMap;

public class LRUCache {
    HashMap<Integer,Node>hm=new HashMap<>();
    Node head,tail;

    int capacity;

    public LRUCache(int capacity) {
        this.capacity=capacity;


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
            remove(tail);
        }
        insert(new Node(key,value));

    }
    public void insert(Node node)
    {
        if(hm.size()==0)
        {
            head=node;
            tail=head;
            hm.put(node.key,node);
            return;
        }
        hm.put(node.key,node);
        head.prev=node;
        node.next=head;
        head=node;
    }
    public void remove(Node node) {
        hm.remove(node.key);

        if (node == tail) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            }
        } else if (node == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        } else {

            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
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

