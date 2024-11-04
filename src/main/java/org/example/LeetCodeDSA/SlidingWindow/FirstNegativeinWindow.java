package org.example.LeetCodeDSA.SlidingWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeinWindow {
    static List<Integer> printFirstNegativeInteger(int arr[], int k) {
        // write code here
        List<Integer>ans=new ArrayList<>();
        int i=0,j=0;
        Queue<Integer> q=new LinkedList<>();
        while(j<arr.length)
        {
            if(arr[j]<0)
            {
                q.add(arr[j]);
            }
            if(j-i+1<k)
            {
                j++;
            }
            else if(j-i+1==k)
            {
                if(q.size()==0)
                {
                    ans.add(0);
                }
                else
                {
                    ans.add(q.peek());
                    if(arr[i]==q.peek())
                    {
                        q.poll();
                    }

                }
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={-8, 2, 3, -6, 10};
        List<Integer>ans=printFirstNegativeInteger(arr,2);
        System.out.println(ans);

    }
}
