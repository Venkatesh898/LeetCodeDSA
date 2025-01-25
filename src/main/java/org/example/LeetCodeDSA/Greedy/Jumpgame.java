package org.example.LeetCodeDSA.Greedy;

public class Jumpgame {
    public boolean canJump(int[] nums) {
        int finalPosition=nums.length-1;
        for(int ind=nums.length-2;ind>=0;ind-- )
        {
            if(ind+nums[ind]>=finalPosition)
            {
                finalPosition=ind;
            }
        }
        return finalPosition==0;
    }
}
