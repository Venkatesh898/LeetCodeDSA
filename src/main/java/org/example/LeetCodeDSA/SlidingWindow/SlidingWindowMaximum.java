package org.example.LeetCodeDSA.SlidingWindow;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length,j=0;
        int res[]=new int[n-k+1];
        Deque<Integer> qu =new ArrayDeque<Integer>();
        for(int i=0;i<k;i++)
        {
            while(!qu.isEmpty()&&nums[i]>=nums[qu.peekLast()])
            {
                qu.removeLast();
            }
            qu.addLast(i);
        }
        for(int i=k;i<nums.length;i++)
        {
            res[j++]=nums[qu.peekFirst()];
            while(!qu.isEmpty()&&qu.peekFirst()<=i-k)
            {
                qu.removeFirst();
            }
            while(!qu.isEmpty()&&nums[i]>=nums[qu.peekLast()])
            {
                qu.removeLast();
            }
            qu.addLast(i);
        }
        res[j]=nums[qu.peekFirst()];
        return res;

    }
}
