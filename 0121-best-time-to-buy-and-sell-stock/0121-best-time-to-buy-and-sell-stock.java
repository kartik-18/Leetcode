class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int max = Integer.MIN_VALUE;
        int n = prices.length-1;

        for(int i = n; i>=0 ; i--){
            if(prices[i] > max)
                max= prices[i];
            if(max - prices[i] >= res)
                res = max - prices[i];
        }

        return res;
    }

   
}