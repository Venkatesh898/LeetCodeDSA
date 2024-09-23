package org.example.LeetCodeDSA;

import java.util.HashMap;
import java.util.Map;

public class SubStringWithmaxCost {
    public static void main(String[] args) {
        String s="adaa",chars="d";
        int vals[]={-1000};
        int ans=maximumCostSubstring(s,chars,vals);
        System.out.println(ans);
    }
    public static int maximumCostSubstring(String s, String chars, int[] vals) {
        Map<Character, Integer> map = new HashMap<>();
        int maxCost = 0, curCost = 0;
        for(int i = 0; i < chars.length(); i++) {
            map.put(chars.charAt(i), vals[i]);
        }
        for(char ch : s.toCharArray()) {
            int value = map.getOrDefault(ch, ch - 'a' + 1);
            if(curCost + value > value) {
                curCost += value;
            } else {
                curCost = value;
            }
            maxCost = Math.max(maxCost, curCost);
        }
        return maxCost;
    }
}
