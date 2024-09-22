package org.example.LeetCodeDSA;

public class TwoSumInSortedArray {
    public static void main(String[] args) {
        int nums[]={2,3,4};
        int target=6;
        int ans[]=twoSum(nums,target);
        System.out.println("first: "+ans[0]+ " second: "+ans[1]);
    }
    public static int[] twoSum(int[] numbers, int target) {
        int ans[]=new int[2];
        int start=0,end=numbers.length-1;
        while(start<end)
        {
            if(numbers[start]+numbers[end]==target)
            {
                ans[0]=start+1;
                ans[1]=end+1;
                return ans;
            }
            else if((numbers[start]+numbers[end])>target)
            {
                end--;
            }
            else
                start++;
        }
        return ans;

    }
}
