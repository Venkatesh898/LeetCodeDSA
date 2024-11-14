package org.example.LeetCodeDSA.SlidingWindow;

import java.util.HashMap;

public class LongestSubarrayWithAtmostKFrequency {
    public int maxSubarrayLength(int[] nums, int k) {
        int r = 0, l = 0, ans = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        while (r < nums.length) {
            hm.put(nums[r], hm.getOrDefault(nums[r], 0) + 1);
            while (hm.get(nums[r]) > k) {
                int val = nums[l];
                hm.put(val, hm.get(val) - 1);
                l += 1;
            }
            ans = Math.max(r - l + 1, ans);
            r++;
        }
        return ans;
    }
}
