package org.example.LeetCodeDSA;

public class DuplicateNumber {
    public static void main(String[] args) {
        int nums[]={1,3,4,2,2};
        int ans=findDuplicate(nums);
        System.out.println(ans);
    }
    public static int findDuplicate(int[] nums) {
        boolean[] arr = new boolean[nums.length];
        for (int num: nums){
            if (arr[num]) {
                return num;
            }
            arr[num] = true;
        }
        return -1;
    }
}
