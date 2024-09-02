package org.example.LeetCodeDSA;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        //price of a stock on ith day
        int prices[]={7,1,5,3,6,4};
        BestTimeToBuyAndSellStock stock=new BestTimeToBuyAndSellStock();
        int maxProfitResult=stock.maxProfit(prices);
        System.out.println(maxProfitResult);
      }
    public int maxProfit(int[] prices) {
        int left=0,right=1,maxProfit=0; //left=buy and right=sell
        while(right<prices.length)
        {
            if(prices[right]>prices[left])
            {
                maxProfit=Math.max(maxProfit,prices[right]-prices[left]);
            }
            else
                left=right;
            right++;
        }
        return maxProfit;

    }
}
