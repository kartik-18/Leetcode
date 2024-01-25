class Solution {
    
    public int f(String s, String t, int m, int n,int[][]dp){
        
        if(m < 0 || n < 0)return 0;
        if(dp[m][n] != -1)return dp[m][n];
        if(s.charAt(m) == t.charAt(n)){
            return dp[m][n]= 1 + f(s,t,m-1,n-1,dp);
        }
        else return dp[m][n] = Math.max(f(s,t,m-1,n,dp),f(s,t,m,n-1,dp));
    }
    
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][]dp = new int[m][n];
        for(int[]row : dp){
            Arrays.fill(row,-1);
        }
        return f(text1,text2,m-1,n-1,dp);
    }
}