package org.example.LeetCodeDSA.Greedy;

import java.util.ArrayList;
import java.util.Collections;

public class ChocolateDistribution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        if(arr.size()==m)
        {
            return arr.get(arr.size()-1)-arr.get(0);
        }
        int i=0,it=1;
        int windowSize=m-1;
        int ans=Integer.MAX_VALUE;
        while(windowSize<arr.size())
        {
            ans=Math.min(arr.get(windowSize++)-arr.get(i++),ans);

        }
        return ans;
    }
}
