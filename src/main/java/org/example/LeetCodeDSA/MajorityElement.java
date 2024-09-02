package org.example.LeetCodeDSA;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int nums[]={2,2,1,1,1,2,2};
        int result=majorityElement(nums);
        System.out.println(result);
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int a=0;
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            if(hm.get(nums[i])>(nums.length)/2)
            {
                a= nums[i];
                break;
            }
        }

        return a;

    }
}
