package org.example.LeetCodeDSA.SlidingWindow;

import java.util.HashSet;

public class MaxVowelsInASubstringOfGivenLength {
    public int maxVowels(String s, int k) {
        HashSet<Character> hs=new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        int count=0;int st=0,max=0;
        for(int i=0;i<k;i++)
        {
            if(hs.contains(s.charAt(i)))
                count++;
        }
        max=count;
        for(int j=k;j<s.length();j++)
        {
            if(hs.contains(s.charAt(j)))
                count++;
            if(hs.contains(s.charAt(st)))
            {
                count--;
            }
            st++;
            max=Math.max(count,max);


        }
        return max;



    }
}
