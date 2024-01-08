class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        if (prices == null || prices.length < 2) {
            return maxProfit;
        }

        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - buy);
            buy = Math.min(buy, prices[i]);
        }

        return maxProfit;
    }
}