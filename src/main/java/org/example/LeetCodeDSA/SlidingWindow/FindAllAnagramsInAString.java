package org.example.LeetCodeDSA.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (s.length() < p.length()) return ans;

        int[] pCount = new int[26];
        int[] sCount = new int[26];


        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int pLength = p.length();


        for (int i = 0; i < pLength; i++) {
            sCount[s.charAt(i) - 'a']++;
        }


        if (Arrays.equals(sCount, pCount)) {
            ans.add(0);
        }


        for (int i = pLength; i < s.length(); i++) {

            sCount[s.charAt(i) - 'a']++;

            sCount[s.charAt(i - pLength) - 'a']--;

            if (Arrays.equals(sCount, pCount)) {
                ans.add(i - pLength + 1);
            }
        }

        return ans;
    }
}
