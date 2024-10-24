package org.example.LeetCodeDSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class AsteriodCollison {

        public int[] asteroidCollision(int[] asteroids) {
            int id=0;
            ArrayList<Integer> al=new ArrayList<>();
            Stack<Integer> stack=new Stack<>();
            Stack<Integer>ss=new Stack<>();
            while(id<asteroids.length&&asteroids[id]<0)
            {
                al.add(asteroids[id]);
                id++;
            }
            while(id<asteroids.length)
            {
                if(!stack.isEmpty()&&stack.peek()==Math.abs(asteroids[id])&&stack.peek()*asteroids[id]<0)
                {
                    stack.pop();
                    id++;
                    continue;
                }
                if(asteroids[id]>0)
                {
                    stack.push(asteroids[id]);
                }
                else
                {
                    while(!stack.isEmpty()&&stack.peek()<Math.abs(asteroids[id]))
                    {
                        stack.pop();

                    }
                    if(!stack.isEmpty()&&stack.peek()==Math.abs(asteroids[id])&&stack.peek()*asteroids[id]<0)
                    {
                        stack.pop();
                        id++;
                        continue;
                    }
                    else if(stack.isEmpty())
                    {
                        al.add(asteroids[id]);
                    }
                }
                id++;
            }
            while(!stack.isEmpty())
            {
                ss.push(stack.peek());
                stack.pop();
            }
            while(!ss.isEmpty())
            {
                al.add(ss.peek());
                ss.pop();
            }
            int ans[]=new int[al.size()];
            for(int i=0;i<al.size();i++)
            {
                ans[i]=al.get(i);
            }
            return ans;

        }

    public static void main(String[] args) {
        AsteriodCollison object=new AsteriodCollison();
        int arr[]={10,2,-5,40};
        int ans[]=object.asteroidCollision(arr);
        System.out.println((Arrays.toString(ans)));
    }
    }

