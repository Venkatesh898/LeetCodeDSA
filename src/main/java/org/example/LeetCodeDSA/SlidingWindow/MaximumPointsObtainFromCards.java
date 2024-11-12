package org.example.LeetCodeDSA.SlidingWindow;

public class MaximumPointsObtainFromCards {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0,maxPoints=0,fId=k-1,lId=cardPoints.length-1;
        for(int i=0;i<k;i++)
        {
            sum+=cardPoints[i];
        }
        if(k==lId+1)
            return sum;
        maxPoints=Math.max(maxPoints,sum);
        for(int i=0;i<k;i++)
        {
            sum-=cardPoints[fId--];
            sum+=cardPoints[lId--];
            maxPoints=Math.max(maxPoints,sum);

        }
        return maxPoints;

    }
}
