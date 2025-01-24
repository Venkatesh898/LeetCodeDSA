package org.example.LeetCodeDSA.Greedy;

import java.util.Arrays;

public class MaxBagsWithFullCapacityOfRocks {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        for(int i=0;i<capacity.length;i++)
        {
            capacity[i]-=rocks[i];
        }
        int count=0;
        Arrays.sort(capacity);
        for(int i=0;i<capacity.length;i++)
        {
            if(capacity[i]==0)
            {
                count++;
            }
            if(capacity[i]!=0&&additionalRocks>=capacity[i])
            {
                additionalRocks-=capacity[i];
                count++;
            }
        }
        return count;

    }
}
