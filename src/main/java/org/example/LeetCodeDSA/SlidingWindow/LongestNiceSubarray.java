package org.example.LeetCodeDSA.SlidingWindow;

public class LongestNiceSubarray {
    public int longestNiceSubarray(int[] nums) {
        int start=0,end=0,maxLength=0,bitUnion=0;
        while(end<nums.length)
        {
            while((bitUnion&nums[end])!=0)
            {
                int first=nums[start];
                bitUnion^=first;
                start++;
            }
            bitUnion|=nums[end];
            maxLength=Math.max(maxLength,end-start+1);
            end++;
        }
        return maxLength;

    }
}
