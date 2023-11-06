class Solution {
    
    public static int ans(int a[],int n,int b,int dp[][]){
        
        if(n >= a.length)return 0;
        if(dp[n][b] != -1)return dp[n][b];
        
        if(b == 1){
            return dp[n][b] = Math.max(-a[n] + ans(a,n+1,0,dp), ans(a,n+1,1,dp));
        }else{
            return dp[n][b] = Math.max(a[n]+ans(a,n+2,1,dp), ans(a,n+1,0,dp));
        }
    }
    
    public int maxProfit(int[] prices) {
        int[][]dp = new int[prices.length][2];
        for(int i = 0 ; i < dp.length ;i++){
            for(int j= 0 ; j<2 ; j++){
                dp[i][j] = -1;
            }
        }
        return ans(prices,0,1,dp);
    }
}