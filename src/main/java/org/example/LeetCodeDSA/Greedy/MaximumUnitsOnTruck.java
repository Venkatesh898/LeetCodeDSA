package org.example.LeetCodeDSA.Greedy;

import java.util.Arrays;

public class MaximumUnitsOnTruck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (b1, b2) -> Integer.compare(b2[1], b1[1]));
        int maxUnits=0;
        for(int i=0;i<boxTypes.length;i++)
        {
            if(truckSize>0)
            {
                if(boxTypes[i][0]<truckSize)
                {
                    maxUnits+=boxTypes[i][0]*boxTypes[i][1];
                    truckSize-=boxTypes[i][0];
                }
                else
                {
                    maxUnits+=truckSize*boxTypes[i][1];
                    break;
                }
            }
            else
            {
                break;
            }
        }
        return maxUnits;

    }
}
