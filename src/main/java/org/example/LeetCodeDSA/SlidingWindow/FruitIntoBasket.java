package org.example.LeetCodeDSA.SlidingWindow;

import java.util.HashMap;

public class FruitIntoBasket {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int start = 0, end = 0, maxLength = 0;
        while (end < fruits.length) {
            hm.put(fruits[end], hm.getOrDefault(fruits[end], 0) + 1);
            while (hm.size() > 2) {
                hm.put(fruits[start], hm.get(fruits[start]) - 1);
                if (hm.get(fruits[start]) == 0) {
                    hm.remove(fruits[start]);
                }
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
            end++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        FruitIntoBasket obj = new FruitIntoBasket();
        int ans = obj.totalFruit(new int[]{3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4});
        System.out.println(ans);
    }
}
