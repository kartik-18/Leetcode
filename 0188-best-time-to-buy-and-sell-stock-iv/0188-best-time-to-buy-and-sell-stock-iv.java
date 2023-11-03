class Solution {
    public int bottomup(int K, int[] p) {
        int[][][] dp = new int[p.length + 1][3][K + 1];
        
        for (int ind = p.length - 1; ind >= 0; ind--) {
            for (int b = 0; b <= 1; b++) {
                for (int k = 1; k <= K; k++) {
                    if (b == 1) {
                        dp[ind][b][k] = Math.max(-p[ind] + dp[ind + 1][0][k], dp[ind + 1][b][k]);
                    } else {
                        dp[ind][b][k] = Math.max(p[ind] + dp[ind + 1][1][k - 1], dp[ind + 1][b][k]);
                    }
                }
            }
        }
        return dp[0][1][K];
    }

    public int maxProfit(int k, int[] prices) {
        return bottomup(k, prices);
    }
}
