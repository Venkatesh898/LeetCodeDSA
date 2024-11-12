package org.example.LeetCodeDSA.SlidingWindow;

public class LeetCode1493 {
    public int longestSubarray(int[] nums) {
        int max=0,left=0,right=0,zeroCount=0;
        while(right<nums.length)
        {
            if(nums[right]==0)
            {
                zeroCount++;
            }

            while(zeroCount>1)
            {
                if(nums[left]==0)
                {
                    zeroCount--;
                }
                left++;
            }
            max=Math.max(right-left,max);
            right++;
        }

        return max;

    }
}
