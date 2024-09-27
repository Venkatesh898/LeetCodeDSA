package org.example.LeetCodeDSA;

import java.util.HashMap;

public class LeetCode2023NoOfPairs {
    public static void main(String[] args) {
        String nums[]={"777","7","77","77"},target="7777";
        int ans=numOfPairs(nums,target);
        System.out.println(ans);

    }
    public static int numOfPairs(String[] nums, String target) {
        int cnt=0;
        HashMap<String, Integer> frq=new HashMap();

        for(String num:nums){
            frq.put(num, frq.getOrDefault(num, 0)+1);
        }

        for(String num:nums){
            if(target.startsWith(num)){
                String suf=target.substring(num.length());
                if(frq.containsKey(suf)){
                    cnt+=frq.get(suf)-(num.equals(suf)? 1:0);
                }
            }
        }
        return cnt;

    }
}
