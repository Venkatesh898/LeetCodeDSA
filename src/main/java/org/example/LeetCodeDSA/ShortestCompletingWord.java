package org.example.LeetCodeDSA;

import java.util.HashMap;

public class ShortestCompletingWord {
    public static void main(String[] args) {
        String words[]={"step","steps","stripe","stepple"};
        String licensePlate="1s3 PSt"; // s 2 p 1 t 1
        String ans=shortestCompletingWord(licensePlate,words);
        System.out.println(ans);

    }
    public static  String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character,Integer> hm1=new HashMap<>();
        licensePlate=licensePlate.toLowerCase();
        for(int i=0;i<licensePlate.length();i++)
        {
            char ch=licensePlate.charAt(i);
            if(ch >= 97 && ch <= 122)
            {
                hm1.put(ch,hm1.getOrDefault(ch,0)+1);
            }
        }
        HashMap<Character,Integer>hm;
        int ans=Integer.MAX_VALUE;
        String res="";
        for(int i=0;i<words.length;i++)
        {
            hm=new HashMap<>(hm1);
            for(int j=0;j<words[i].length();j++)
            {
                char c=words[i].charAt(j);
                if(hm.containsKey(c))
                {
                    hm.put(c,hm.get(c)-1);
                    if(hm.get(c)==0)
                        hm.remove(c);
                }
                if(hm.size()==0)
                {
                    ans=Math.min(ans,words[i].length());
                    res=words[i];
                }
            }
        }
        return res;
    }
}
