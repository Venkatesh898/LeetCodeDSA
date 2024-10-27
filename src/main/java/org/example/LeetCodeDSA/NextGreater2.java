package org.example.LeetCodeDSA;

import java.util.Arrays;
import java.util.Stack;

class NextGreater2 {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int ans[]=new int[nums.length];
        int n=nums.length;
        for(int i=2*n-1;i>=0;i--)
        {
            if(!stack.isEmpty())
            {
                while(!stack.isEmpty()&&stack.peek()<=nums[i%n])
                {
                    stack.pop();
                }
            }
            if(i<n)
            {
                if(stack.isEmpty())
                {
                    ans[i]=-1;
                }
                else
                {
                    ans[i]=stack.peek();
                }
            }
            stack.push(nums[i%n]);
        }
        return ans;

    }

    public static void main(String[] args) {
        NextGreater2 obj=new NextGreater2();
        int arr[]={1,2,3,4,3};
        System.out.println(Arrays.toString(obj.nextGreaterElements(arr)));
    }
}
