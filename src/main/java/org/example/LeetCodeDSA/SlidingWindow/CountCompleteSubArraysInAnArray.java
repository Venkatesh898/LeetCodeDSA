package org.example.LeetCodeDSA.SlidingWindow;

import java.util.HashMap;

public class CountCompleteSubArraysInAnArray {
    public int countCompleteSubarrays(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int count=0,left=0;
        for(int n: nums)
        {
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        int initSize=hm.size();
        hm.clear();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            while(hm.size()==initSize)
            {
                count+=nums.length-i;
                hm.put(nums[left],hm.get(nums[left])-1);
                if(hm.get(nums[left])==0)
                {
                    hm.remove(nums[left]);
                }
                left++;
            }
        }
        return count;

    }
}
