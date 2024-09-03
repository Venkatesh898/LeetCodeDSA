package org.example.LeetCodeDSA;

public class ProductOfArrayExceptItself {
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        nums=productExceptSelf(nums);
        for(int val:nums)
            System.out.println(val);
    }
    public static int[] productExceptSelf(int[] nums) {
        int prefix[]=new int[nums.length];
        int suffix[]=new int [nums.length];
        prefix[0]=1;
        suffix[nums.length-1]=1;
        int n=nums.length-1;
        for(int i=1;i<nums.length;i++)
        {
            prefix[i]=prefix[i-1]*nums[i-1];
            suffix[n-i]=suffix[n-i+1]*nums[n-i+1];
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=prefix[i]*suffix[i];
        }
        return nums;


    }
}
