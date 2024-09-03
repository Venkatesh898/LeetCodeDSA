package org.example.LeetCodeDSA;

public class ContainerWithWater {
    public static void main(String[] args) {
        int nums[]={1,8,6,2,5,4,8,3,7};
        int result=maxArea(nums);
        System.out.println(result);


    }
    public static int maxArea(int[] height) {
        int n=height.length;
        int left=0,right=n-1,max=0;
        while(left<right)
        {
            max=Math.max(max,(right-left)*Math.min(height[left],height[right]));
            if(height[left]<height[right])
            {
                left++;
            }
            else
                right--;
        }
        return max;

    }
}
