package org.example.stackimpl;

public class DynamicStackMain {
    public static void main(String[] args) {
        DynamicStack ds=new DynamicStack(2);
        ds.push(2);
        ds.push(4);
        ds.push(5);
        System.out.println(ds.peek());
    }
}
