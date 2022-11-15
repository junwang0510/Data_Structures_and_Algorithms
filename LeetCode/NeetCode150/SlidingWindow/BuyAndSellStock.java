package LeetCode.NeetCode150.SlidingWindow;

class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        // Runtime: O(n)
        // Space: O(1)

        // Base case
        if (prices.length == 1) return 0;

        // Normal case
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int curr = prices[i];
            if (curr < minPrice) {
                minPrice = curr;
            } else {
                maxProfit = Math.max(maxProfit, curr - minPrice);
            }
        }

        return maxProfit;
    }
}
