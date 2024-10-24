package org.example.LeetCodeDSA;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {

        public int[] dailyTemperatures(int[] temperatures) {
            Stack<Pair1>stack=new Stack<>();
            int indexArray[]=new int[temperatures.length];
            for(int i=temperatures.length-1;i>=0;i--)
            {
                if(!stack.isEmpty())
                {
                    while(!stack.isEmpty()&&temperatures[i]>=stack.peek().value)
                    {
                        stack.pop();
                    }
                }
                if(stack.isEmpty())
                {
                    indexArray[i]=0;
                }
                else
                {
                    indexArray[i]=stack.peek().index;
                }
                stack.push(new Pair1(temperatures[i],i));

            }

            for(int i=0;i<temperatures.length;i++)
            {
                if(indexArray[i]!=0)
                    indexArray[i]=indexArray[i]-i;
            }
            return indexArray;
        }

    public static void main(String[] args) {
        DailyTemperatures obj=new DailyTemperatures();
        int arr[]={73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(obj.dailyTemperatures(arr)));
    }
    }
    class Pair1
    {
        int value;
        int index;
        public Pair1(int value,int index)
        {
            this.value=value;
            this.index=index;
        }
    }

