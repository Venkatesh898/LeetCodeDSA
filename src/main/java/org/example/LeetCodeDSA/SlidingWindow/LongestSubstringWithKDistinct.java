package org.example.LeetCodeDSA.SlidingWindow;

import java.util.HashMap;

public class LongestSubstringWithKDistinct {
    public int longestkSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer> hm=new HashMap<>();
        int i=0,j=0,maxLength=-1;
        while(j<s.length())
        {
            char c=s.charAt(j);

            hm.put(c,hm.getOrDefault(c,0)+1);

            if(hm.size()==k)
            {
                maxLength=Math.max(maxLength,j-i+1);
            }
            while(hm.size()>k)
            {
                hm.put(s.charAt(i),hm.get(s.charAt(i))-1);
                if(hm.get(s.charAt(i))==0)
                {
                    hm.remove(s.charAt(i));
                }
                i++;
            }

            j++;
        }
        return maxLength;
    }
}
