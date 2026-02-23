package by.ivan.zelezinski.test.project.task121;

import java.util.Arrays;

public class Solution121 {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        //kadane's algo
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}