package org.example.LeetCodeDSA.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k==0)
        {
            return false;
        }
        Set<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!hs.add(nums[i]))
            {
                return true;
            }
            if(hs.size()>k)
            {

                hs.remove(nums[i-k]);
            }

        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate2 obj=new ContainsDuplicate2();
        int arr[]={1,2,3,1,2,3};
        System.out.println(obj.containsNearbyDuplicate(arr,2));
    }
}
