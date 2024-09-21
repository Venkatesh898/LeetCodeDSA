package org.example.LeetCodeDSA;

public class MaxCntOfPosNegIntegers2529 {
    public static void main(String[] args) {
        int nums[]={-3,-2,-1,0,0,1,2};
        System.out.println(maximumCount(nums));

    }
    public static  int maximumCount(int[] nums) {
        if (nums[0] > 0 || nums[nums.length - 1] < 0)
            return nums.length;

        int start = 0, end = nums.length - 1;
        int firstNeg = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < 0) {
                if (mid <= end && nums[mid + 1] >= 0) {
                    firstNeg = mid;
                    break;
                }
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        start = 0;
        end = nums.length - 1;
        int firstPos = nums.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > 0) {
                if (mid >= start && nums[mid - 1] <= 0) {
                    firstPos = mid;
                    break;
                }
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        int negCount = firstNeg + 1;
        int posCount = nums.length - firstPos;

        return Math.max(negCount, posCount);
    }
}
