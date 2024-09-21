package org.example.LeetCodeDSA;

public class MinimumElementInSortedRotated {
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        int ans=findMin(arr);
        System.out.println(ans);

    }
    static int  findMin(int nums[])
    {
        int start=0,end=nums.length-1,mid;
        int min=Integer.MAX_VALUE;
        if(nums[start]<nums[end])
        {
            return nums[0];
        }
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(nums[start]<=nums[mid])
            {
                min=Math.min(nums[start],min);
                start=mid+1;
            }
            else
            {
                min=Math.min(nums[mid],min);
                end=mid-1;
            }

        }
        return min;
    }
}
