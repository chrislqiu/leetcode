class Solution {
    public int maxProfit(int[] prices) {
        int lPtr = 0;
        int rPtr = 1;
        int maxProfit = 0;
        while (rPtr < prices.length) {
            if (prices[lPtr] < prices[rPtr]) {
                maxProfit = Math.max(maxProfit, prices[rPtr] - prices[lPtr]);
            } else {
                lPtr = rPtr;
            }
            rPtr++;
        }
        return maxProfit;
    }
}
