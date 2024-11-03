package org.example.LeetCodeDSA.SlidingWindow;

public class SubArrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k==0)
        {
            return 0;
        }
        int product=1,ans=0;
        int left=0,right=0;
        for(int i=right;i<nums.length;i++)
        {
            product*=nums[i];


            while(product>=k&&left<=i)
            {
                product=product/nums[left++];
            }
            ans+=i-left+1;

        }
        return ans;

    }

    public static void main(String[] args) {
        SubArrayProductLessThanK obj=new SubArrayProductLessThanK();
        int arr[]={10,5,2,6};
        System.out.println(obj.numSubarrayProductLessThanK(arr,100));
    }
}
