package org.example.LeetCodeDSA;

public class BinarySearch {
    public static void main(String[] args) {
        int nums[]={-1,0,3,5,9,12};
        int target=2;
        int result=search(nums,target);
        System.out.println(result);
    }
    public static int search(int[] nums, int target) {
        int start=0,end=nums.length-1,mid;

        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]>target)
            {
                end=mid-1;
            }
            else
                start=mid+1;
        }
        return -1;

    }
}
