package org.example.LeetCodeDSA;

public class MinimumElementInSortedRotated {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,1,2};
        int ans=pivot(arr,arr.length);
        System.out.println(arr[ans+1]);

    }
    static int  pivot(int arr[],int n)
    {
        int start=0,end=n-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid<end&&arr[mid]>arr[mid+1])
                return mid;
            if(mid>start&&arr[mid]<arr[mid-1])
                return mid-1;
            if(arr[start]>=arr[mid])
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }
}
