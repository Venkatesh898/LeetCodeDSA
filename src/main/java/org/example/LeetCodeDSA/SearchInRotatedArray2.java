package org.example.LeetCodeDSA;

public class SearchInRotatedArray2 {
    public static void main(String[] args) {
        int nums[]={2,5,6,0,0,1,2};
        System.out.println(search(nums,0));

    }
    public static boolean search(int[] nums, int target) {
        int start=0,end=nums.length-1,mid;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(nums[mid]==target)
                return true;
            if(nums[start]==nums[mid]&&nums[end]==nums[mid])
            {
                start++;
                end--;
            }
            else if(nums[start]<=nums[mid])
            {
                if(nums[mid]>=target&&nums[start]<=target)
                    end=mid-1;
                else
                    start=mid+1;
            }
            else
            {
                if(nums[mid]<=target&&nums[end]>=target)
                    start=mid+1;
                else
                    end=mid-1;
            }
        }
        return false;

    }
}
