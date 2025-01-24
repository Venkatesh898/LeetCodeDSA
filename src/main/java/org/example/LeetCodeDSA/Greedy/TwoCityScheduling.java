package org.example.LeetCodeDSA.Greedy;

import java.util.Arrays;

public class TwoCityScheduling {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a, b)->Integer.compare((a[1]-a[0]),(b[1]-b[0])));
        int ans=0;
        for(int i=0;i<costs.length/2;i++)
        {
            ans+=costs[i][1];
        }
        for(int i=costs.length/2;i<costs.length;i++)
        {
            ans+=costs[i][0];
        }
        return ans;
    }
}
