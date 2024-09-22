package org.example.LeetCodeDSA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

public class FourSum {
    public static void main(String[] args) {
        int nums[]={1,0,-1,0,-2,2};
        List<List<Integer>>ans=fourSum(nums,0);
        System.out.println(ans);

    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        if(nums[0]>=0&&target<0)
        {
            return new ArrayList<>();
        }
        Set<List<Integer>>set=new HashSet<>();
        for(int i=0;i<nums.length-3;i++)
        {
            int t=target-nums[i];
            for(int j=i+1;j<nums.length-2;j++)
            {
                int start=j+1,end=nums.length-1;

                while(start<end)
                {
                    int sum=nums[j]+nums[start]+nums[end];
                    if(sum==t)
                    {
                        set.add(Arrays.asList(nums[i],nums[j],nums[start],nums[end]));
                        start++;
                        end--;

                    }
                    else if(sum>t)
                    {
                        end--;
                    }
                    else
                    {
                        start++;
                    }
                }
            }
        }
        return new ArrayList<>(set);

    }
}
