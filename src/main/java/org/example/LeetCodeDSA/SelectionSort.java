package org.example.LeetCodeDSA;

public class SelectionSort {
    public static void main(String[] args) {
        int nums[]={4,1,2,8,0,9};
        for(int i=0;i<nums.length-1;i++)
        {
            int min=Integer.MAX_VALUE;
            int index=-1;
            for(int j=i+1;j< nums.length;j++)
            {
               if(nums[j]<min)
               {
                   min=nums[j];
                   index=j;
               }
            }
            if(nums[i]>nums[index]) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }

        }
        for(int val: nums)
        {
            System.out.println(val);
        }
    }


}
