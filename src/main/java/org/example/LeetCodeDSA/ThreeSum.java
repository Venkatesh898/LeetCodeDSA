package org.example.LeetCodeDSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int nums[]={-1,0,1,2,-1,-4};
        List<List<Integer>>ans=threeSum(nums);
        System.out.println(ans);

    }
    public static List<List<Integer>> threeSum(int[] nums) {
        if(nums==null|| nums.length<3)
            return new ArrayList<>();
        Arrays.sort(nums);//
        HashSet<List<Integer>>hs=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n-2;i++)
        {
            int low=i+1;
            int high=n-1;

            while(low<high)
            {
                int sum=nums[i]+nums[low]+nums[high];
                if(sum==0)
                {
                    hs.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low++;
                    high--;
                }
                else if(sum>0)
                    high--;
                else
                    low++;
            }
        }
        return new ArrayList<>(hs);


    }
}
