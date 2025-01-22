package org.example.LeetCodeDSA.Greedy;

import java.util.PriorityQueue;

public class MinimumCostOfRopes {
    public int minCost(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i:arr)
        {
            pq.add(i);
        }
        int cost=0;
        while(pq.size()>1)
        {
            int first=pq.poll();
            int second= pq.poll();
            int sum=first+second;
            cost+=sum;
            pq.add(sum);
        }
        return cost;
    }
}
