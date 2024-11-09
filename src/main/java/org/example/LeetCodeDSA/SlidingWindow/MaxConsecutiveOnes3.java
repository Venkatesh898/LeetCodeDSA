package org.example.LeetCodeDSA.SlidingWindow;

public class MaxConsecutiveOnes3 {
    public int longestOnes(int[] nums, int k) {
        int left=0,right=0,zeroSum=0,maxLength=0;
        while(right<nums.length)
        {
            if(nums[right]==0)
            {
                zeroSum++;
            }
            while(zeroSum>k)
            {
                if(nums[left]==0)
                {
                    zeroSum--;
                }
                left++;
            }
            if(zeroSum<=k)
            {
                maxLength=Math.max(right-left+1,maxLength);
            }
            right++;
        }
        return maxLength;
    }
}
