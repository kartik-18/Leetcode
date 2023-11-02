class Solution {
    public int helperSO(int[] prices){
        int[][] curr = new int[2][3];
        int[][] next = new int[2][3];
        for(int[] row : curr) Arrays.fill(row, 0);
        for(int[] row : next) Arrays.fill(row, 0);

        for(int index = prices.length - 1; index >= 0; index--){
            for(int buy = 0; buy < 2; buy++){
                for(int limit = 1; limit < 3; limit++){
                    int totalProfit = 0;
                    if(buy == 1){
                        int buyKaro = -prices[index] + next[0][limit];
                        int skipKaro = next[1][limit];
                        totalProfit = Math.max(buyKaro, skipKaro);
                    }else{
                        int sellKaro = prices[index] + next[1][limit - 1];
                        int skipKaro = next[0][limit];
                        totalProfit = Math.max(sellKaro, skipKaro);
                    }
                    curr[buy][limit] = totalProfit;
                }
            }
            next = curr.clone();
        }
        return next[1][2];
    }

    public int maxProfit(int[] prices) {
        // int n = prices.length;
        return helperSO(prices);
    }
}