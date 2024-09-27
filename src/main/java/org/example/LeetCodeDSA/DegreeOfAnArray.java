package org.example.LeetCodeDSA;

import java.util.HashMap;

public class DegreeOfAnArray {
    public static void main(String[] args) {
        int nums[]={1,2,2,3,1,4,2};
        int ans=findShortestSubArray(nums);
        System.out.println(ans);

    }
    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer>countOccurances=new HashMap<>();   // 1,3,2,2,3,1
        HashMap<Integer,Integer>firstoccurance=new HashMap<>();
        int degree=0,min=0;
        for(int i=0;i<nums.length;i++)
        {
            firstoccurance.putIfAbsent(nums[i],i);

            countOccurances.put(nums[i],countOccurances.getOrDefault(nums[i],0)+1);
            if(countOccurances.get(nums[i])>degree)
            {
                degree=countOccurances.get(nums[i]);
                min=i-firstoccurance.get(nums[i])+1;

            }
            else if(countOccurances.get(nums[i])==degree)
            {
                min=Math.min(min,i-firstoccurance.get(nums[i])+1);
            }
        }

        return min;

    }
}
