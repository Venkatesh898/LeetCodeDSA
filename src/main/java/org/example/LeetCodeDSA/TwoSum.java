package org.example.LeetCodeDSA;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int nums[]={2,7,11,15};
        int ans[]=new int [2];
        int target=9;
        TwoSum twoSum=new TwoSum();
        ans=twoSum.twoSum(nums,target);
        for(int val:ans)
        System.out.println(val);


    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int ans[]=new int [2];

        for(int i=0;i<nums.length;i++)
        {
            int val=target-nums[i];
            if(hm.containsKey(val))
            {
                ans[0]=hm.get(val);
                ans[1]=i;
                return ans;

            }
            else
            {
                hm.put(nums[i],i);
            }
        }
        return ans;

    }
}
