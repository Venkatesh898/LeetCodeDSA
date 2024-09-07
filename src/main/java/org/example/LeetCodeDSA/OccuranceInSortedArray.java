package org.example.LeetCodeDSA;

public class OccuranceInSortedArray {
    public static void main(String[] args) {
        int nums[]={5,7,7,8,8,10};
        int target=8;
        int first=search(nums,target,true);
        int second=search(nums,target,false);
        System.out.println("The result is : ");
        if(first==-1&&second==-1)
            System.out.println(0);
        System.out.println(second-first+1);

    }
    static int  search(int nums[],int target,boolean flag) {
            int low = 0, high = nums.length - 1;
            int id = -1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (nums[mid] == target) {
                    id = mid;
                    if (flag) {

                        high = mid - 1;

                    } else
                        low = mid + 1;

                } else if (nums[mid] > target)
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            return id;
        }


}
