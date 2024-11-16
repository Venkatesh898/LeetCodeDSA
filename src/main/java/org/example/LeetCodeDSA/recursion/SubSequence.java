package org.example.LeetCodeDSA.recursion;

public class SubSequence {
    public static void main(String[] args) {
      SubSequence sq= new SubSequence();
      sq.printsubsequence("","abc");
    }
    void printsubsequence(String op,String ip)
    {
        if(ip.isEmpty())
        {
            System.out.println(op);
            return;
        }
        printsubsequence(op,ip.substring(1));
        printsubsequence(op+ip.charAt(0),ip.substring(1));

    }
}
