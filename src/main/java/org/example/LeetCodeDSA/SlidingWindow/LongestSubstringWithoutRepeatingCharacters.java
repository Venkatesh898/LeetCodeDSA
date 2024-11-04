package org.example.LeetCodeDSA.SlidingWindow;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int left = 0, right = 0, max = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            if (!hm.containsKey(c)) {
                hm.put(c, right);


            } else {
                left = Math.max(hm.get(c) + 1, left);
                hm.put(c, right);
            }
            max = Math.max(right - left + 1, max);

            right++;
        }
        return max;


    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters obj = new LongestSubstringWithoutRepeatingCharacters();
        String s = "abcdb";
        System.out.println(obj.lengthOfLongestSubstring(s));
    }
}
