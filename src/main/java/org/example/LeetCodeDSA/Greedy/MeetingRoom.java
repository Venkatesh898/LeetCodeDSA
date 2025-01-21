package org.example.LeetCodeDSA.Greedy;

import java.util.ArrayList;
import java.util.Collections;

public class MeetingRoom {
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        ArrayList<Pair> al=new ArrayList<>();
        for(int i=0;i<start.length;i++)
        {
            al.add(new Pair(start[i],end[i]));
        }
        Collections.sort(al,(p1, p2)->p1.second.compareTo(p2.second));
        int count =1;
        int ansEnd=al.get(0).second;
        for(int j=1;j<al.size();j++)
        {
            if(al.get(j).first>ansEnd)
            {
                count++;
                ansEnd=al.get(j).second;
            }
        }
        return count;
    }
}
class Pair
{
    Integer first,second;
    public Pair(Integer first,Integer second)
    {
        this.first=first;
        this.second=second;
    }
}
