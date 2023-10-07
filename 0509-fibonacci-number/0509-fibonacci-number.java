class Solution {
    
    public int fibo(int n,int[]dp){
        if(n == 0) return 0;
        if(n == 1 || n== 2) return 1;
        if(dp[n] != 0) return dp[n];
        return dp[n] = fibo(n-1,dp) + fibo(n-2,dp);
        
    }
    
    public int fib(int n) {
        int[]dp = new int[n+1];
        dp[0] = 0;
        
        return fibo(n,dp);
        
    }
}