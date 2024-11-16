package org.example.LeetCodeDSA.recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(0,195));
    }
    static  int reverse(int ans,int num)
    {
        if(num==0)
        {
            return ans;
        }
        ans*=10;
        ans+=num%10;
        return reverse(ans,num/10);
    }
}
