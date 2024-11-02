package org.example.LeetCodeDSA.SlidingWindow;

import java.util.HashMap;

public class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int sum = 0, ans = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (hm.containsKey(sum - k)) {
                ans += hm.get(sum - k);
            }
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        SubArraySumEqualsK obj=new SubArraySumEqualsK();
        int arr[]={1,1,1};
        System.out.println(obj.subarraySum(arr,2));
    }
}
