package org.example.LeetCodeDSA;

public class RainWaterTrapping {
    public static void main(String[] args) {
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int ans=trap(height);
        System.out.println(ans);


    }
    public static  int trap(int[] height) {
        int left[]=new int[height.length];
        left[0]=height[0];
        int sum=0;
        int right[]=new int[height.length];
        int n=height.length;
        right[height.length-1]=height[height.length-1];
        for(int i=1;i<height.length;i++)
        {
            if(height[i]>left[i-1])
                left[i]=height[i];
            else
                left[i]=left[i-1];
            if(height[n-i-1]>right[n-i])
                right[n-i-1]=height[n-i-1];
            else
                right[n-i-1]=right[n-i];

        }
        for(int i=0;i<height.length;i++)
        {
                sum+=Math.abs(height[i]-Math.min(right[i],left[i]));

        }
        return sum;
}
}
