class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length, minPrice = prices[0], profit = 0;
        for (int i = 1; i < n; i++) {
            if (minPrice > prices[i]) {
                minPrice = prices[i];
            } else {
                profit = Math.max(profit, prices[i] - minPrice);
            }
        }
        return profit;
    }
}