package org.example.LeetCodeDSA;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int nums[]={2,3,-2,4};
        int ans=maxProduct(nums);
        System.out.println(ans);

    }
    public static int maxProduct(int[] nums) {

        int prefix=1;
        int sufix=1;
        int max=Integer.MIN_VALUE;

        int n=nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            if(prefix==0)
                prefix=1;
            if(sufix==0)
                sufix=1;

            prefix=prefix*nums[i];
            sufix=sufix*nums[n-i];
            max=Math.max(max,Math.max(prefix,sufix));

        }
        return max;

    }
}
