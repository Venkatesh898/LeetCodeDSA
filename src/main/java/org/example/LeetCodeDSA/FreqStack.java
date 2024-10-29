package org.example.LeetCodeDSA;

import java.util.HashMap;
import java.util.Stack;

class FreqStack {
    HashMap<Integer,Integer>hm1;
    HashMap<Integer, Stack<Integer>> hm2;
    int maxfreq;

    public FreqStack() {
        hm1=new HashMap<>();
        hm2=new HashMap<>();
        maxfreq=0;
    }

    public void push(int val) {
        int freq= hm1.getOrDefault(val,0)+1;
        hm1.put(val,freq);
        hm2.computeIfAbsent(freq,x->new Stack<>()).push(val);
        if(freq>maxfreq)
        {
            maxfreq=freq;
        }
    }

    public int pop() {
        Stack<Integer>stack=hm2.get(maxfreq);
        int val=stack.pop();
        hm1.put(val,hm1.get(val)-1);
        if(stack.isEmpty())
        {
            maxfreq--;
        }
        return val;
    }

    public static void main(String[] args) {
        FreqStack obj=new FreqStack();
        obj.push(2);obj.push(2);obj.push(1); obj.push(1);
        System.out.println(obj.pop());
    }
}

