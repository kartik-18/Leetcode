class Solution {
    public int maxProfit(int[] prices) {
        int minval = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0 ; i < prices.length ; i++){
            minval = Math.min(minval , prices[i]);
            profit = Math.max(profit ,  prices[i] - minval);
        }
        
        return profit;
    }
}