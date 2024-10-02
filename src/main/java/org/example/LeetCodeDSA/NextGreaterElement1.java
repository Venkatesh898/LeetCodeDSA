package org.example.LeetCodeDSA;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement1 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int nums22[]=new int[nums2.length];

        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums2.length;i++)
        {
            hm.put(nums2[i],i);
        }
        for(int i=0;i<nums1.length;i++)
        {
            if(hm.containsKey(nums1[i]))
            {
                nums1[i]=hm.get(nums1[i]);
            }
        }
        Stack<Integer> st=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--)
        {
            if(!st.isEmpty())
            {
                while(!st.isEmpty()&&st.peek()<=nums2[i])
                {
                    st.pop();
                }
            }
            if(st.isEmpty())
            {
                nums22[i]=-1;
            }
            else
            {
                nums22[i]=st.peek();
            }
            st.push(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++)
        {
            nums1[i]=nums22[nums1[i]];
        }
        return nums1;

    }
    public static void main(String[] args) {

        int num1[]={4,1,2},num2[]={1,3,4,2};
        int ans[]=nextGreaterElement(num1,num2);
        for(int val:ans)
        {
            System.out.println(val);
        }
    }
}
