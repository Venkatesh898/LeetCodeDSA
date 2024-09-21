package org.example.LeetCodeDSA;

public class MinimumInRotatedSortedArray2 {
    public static void main(String[] args) {
        int nums[]={2,2,2,0,1};
        int ans=findMin(nums);
        System.out.println(ans);

    }
    public static int findMin(int[] n) {
        int low=0;
        int high =n.length-1;
        int min = Integer.MAX_VALUE;

        while(low<=high) {
            int mid = (low+high)/2;
            if(n[mid]==n[low] && n[high]==n[mid]){
                min = Math.min(min,n[low]);
                high = high-1;
                low=low+1;
                continue;
            }


            if(n[low]<=n[mid]){
                min=Math.min(min,n[low]);
                low=mid+1;
            }
            else{
                min=Math.min(min,n[mid]);
                high =mid-1;
            }
        }
        return min;
    }
}
