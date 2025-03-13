package org.fxexchange;

public class Stocktiming {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int intbuy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] < intbuy){
                intbuy = prices[i];
            } else if (prices[i] - intbuy > maxprofit) {
                maxprofit = prices[i] - intbuy;
            }
        }
        return maxprofit;
    }
}
