package org.example.LeetCodeDSA;

import java.util.HashSet;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int nums[]={3,4,-1,1};
        int ans=firstMissingPositive(nums);
        System.out.println(ans);

    }
    public  static int firstMissingPositive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int val: nums)
        {
            hs.add(val);
        }
        for(int num=1;num<=nums.length+1;num++)
        {
            if(!hs.contains(num))
                return num;
        }
        return -1;
    }
}
