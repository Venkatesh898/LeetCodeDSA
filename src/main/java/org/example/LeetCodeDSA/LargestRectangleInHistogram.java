package org.example.LeetCodeDSA;

import java.util.Stack;

class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        int arr1[]=nextSmallerToLeft(heights);
        int arr2[]=nextSmallerToRight(heights);
        int width[]=new int[heights.length];
        int max=-1;
        for(int i=0;i<heights.length;i++)
        {
            width[i]=arr2[i]-arr1[i]-1;
        }
        for(int i=0;i<heights.length;i++)
        {

            max=Math.max(max,width[i]*heights[i]);

        }

        return max;

    }

    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        LargestRectangleInHistogram obj=new LargestRectangleInHistogram();
        obj.largestRectangleArea(arr);
    }
    int [] nextSmallerToLeft(int arr[])
    {
        int temp[]=new int[arr.length];
        Stack<Pair> st=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!st.isEmpty())
            {
                while(!st.isEmpty()&&st.peek().element>=arr[i])
                {
                    st.pop();
                }
            }
            if(st.isEmpty())
            {
                temp[i]=-1;
            }
            else
            {
                temp[i]=st.peek().index;
            }
            st.push(new Pair(arr[i],i));
        }
        return temp;
    }
    int [] nextSmallerToRight(int arr[])
    {
        int temp[]=new int[arr.length];
        Stack<Pair>st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            if(!st.isEmpty())
            {
                while(!st.isEmpty()&&st.peek().element>=arr[i])
                {
                    st.pop();
                }
            }
            if(st.isEmpty())
            {
                temp[i]=arr.length;
            }
            else
            {
                temp[i]=st.peek().index;
            }
            st.push(new Pair(arr[i],i));
        }
        return temp;
    }
}
class Pair
{
    int element;
    int index;
    public Pair(int element, int index)
    {
        this.element=element;
        this.index=index;
    }
}