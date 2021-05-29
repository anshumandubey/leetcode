package com.dubey.leetcode;

public class BuySellStock {
    static class Solution {
        public int maxProfit(int[] prices) {
            int profit = 0, buyPrice = 0, sellPrice = 0;
            boolean bought = false;
            for (int i = 0; i < prices.length - 1; i++) {
                if (prices[i] <= prices[i + 1] && bought == false) {
                    buyPrice = prices[i];
                    bought = true;
                } else if (prices[i] > prices[i + 1] && bought == true) {
                    sellPrice = prices[i];
                    profit += sellPrice - buyPrice;
                    bought = false;
                }
            }
            if (bought == true && prices[prices.length - 1] > buyPrice) {
                profit += prices[prices.length - 1] - buyPrice;
            }

            return profit;
        }
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(new Solution().maxProfit(prices));
    }
}
