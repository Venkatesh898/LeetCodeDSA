package org.example.LeetCodeDSA;

public class MaximumSubArray {
    public static void main(String[] args) {
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        int maxSum=maxSubArray(nums);
        System.out.println(maxSum);

    }
    public static int maxSubArray(int[] nums) {

        int currSum=nums[0];
        int maxSumSoFar=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            currSum+=nums[i];
            if(currSum<nums[i] )
            {
                currSum=nums[i];
            }
            if(maxSumSoFar<currSum)
            {
                maxSumSoFar=currSum;
            }
        }
        return maxSumSoFar;


    }
}
