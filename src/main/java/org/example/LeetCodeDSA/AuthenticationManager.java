package org.example.LeetCodeDSA;

import java.util.HashMap;
import java.util.Map;

class AuthenticationManager {
    int timeToLive;
    Map<String,Integer> map;

    public AuthenticationManager(int timeToLive) {
        this.timeToLive=timeToLive;
        map=new HashMap<>();
    }

    public void generate(String tokenId, int currentTime) {
        map.put(tokenId,currentTime);
    }

    public void renew(String tokenId, int currentTime) {
        if(map.size()==0||!map.containsKey(tokenId))
        {
            return;
        }
        if(map.containsKey(tokenId))
        {
            if(map.get(tokenId)+timeToLive>currentTime)
                map.put(tokenId,currentTime);
            else
                map.remove(tokenId);
        }
    }

    public int countUnexpiredTokens(int currentTime) {
        int count=0;
        for(Map.Entry<String,Integer> entry:map.entrySet())
        {
            if(entry.getValue()+timeToLive>currentTime)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        AuthenticationManager am=new AuthenticationManager(5);
        am.renew("aaa",1);
        am.generate("aaa",2);
        System.out.println(am.countUnexpiredTokens(4));

    }
}