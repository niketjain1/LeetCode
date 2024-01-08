class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = Integer.MIN_VALUE;
        int[] minArray = new int[n];
        int[] maxArray = new int[n];
        minArray[0] = prices[0];
        maxArray[n - 1] = prices[n - 1];
        for (int i = 1; i < n; i++) {
            minArray[i] = Math.min(minArray[i - 1], prices[i]);
        }
        for (int j = n - 2; j >= 0; j--) {
            maxArray[j] = Math.max(maxArray[j + 1], prices[j]);
        }
        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(maxProfit, maxArray[i] - minArray[i]);
        }
        return maxProfit;
    }
}