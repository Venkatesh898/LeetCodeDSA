package org.example.LeetCodeDSA;

import java.util.Stack;

class StockSpanner {
    Stack<Pair> st;
    class Pair
    {
        int price;
        int span;
        Pair(int price,int span)
        {
            this.price=price;
            this.span=span;
        }
    }


    public StockSpanner() {
        st=new Stack<>();
    }

    public int next(int price) {
        int span=1;
        while(!st.isEmpty()&&price>=st.peek().price)
        {
            span+=st.pop().span;
        }
        st.push(new Pair(price,span));
        return st.peek().span;

    }

    public static void main(String[] args) {
        StockSpanner obj=new StockSpanner();
        System.out.println(obj.next(100));
        System.out.println(obj.next(80));
        System.out.println(obj.next(60));
        System.out.println(obj.next(70));
        System.out.println(obj.next(60));
        System.out.println(obj.next(75));
        System.out.println(obj.next(85));
    }

}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */