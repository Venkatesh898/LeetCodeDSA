package org.example.LeetCodeDSA.SlidingWindow;

import java.util.HashMap;

public class LongestSubArrayWithSumK {
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        HashMap<Integer,Integer> hm=new HashMap<>();
        int ans=0, sum=0;
        for(int i=0;i<N;i++)
        {
            sum+=A[i];
            if(!hm.containsKey(sum))
                hm.put(sum,i);
            if(sum==K)
            {
                ans=Math.max(ans,i+1);
            }
            int val=sum-K;
            if(hm.containsKey(val))
            {
                ans=Math.max(ans,i-hm.get(val));
            }

        }
        return ans;

    }
}
