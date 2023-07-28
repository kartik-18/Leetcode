class Solution {
    
    
//     RECURSION BASED SOLUTION (TLE);
//     public int md(String s1, String s2, int m , int n){
//         if(m == 0) return n;
//         if(n==0) return m ;
//          if(s1.charAt(m-1) == s2.charAt(n-1)){
//             return md(s1,s2,m-1,n-1);
//         }
//         else
//             return 1 + Math.min(Math.min(md(s1,s2,m-1,n) , md(s1,s2,m,n-1)), md(s1,s2,m-1,n-1));
//     }
    
    public int md(String s1, String s2, int m , int n,int[][] dp){
        for(int i = 0 ; i <= m ; i++){
            dp[i][0] =i;
        }
         for(int i = 0 ; i <= n ; i++){
            dp[0][i] =i;
        }
        
        for(int i = 1 ; i <= m ; i++){
            for(int j = 1 ; j <= n ;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    dp[i][j] = 1 + Math.min((dp[i-1][j-1]), Math.min(dp[i-1][j] , dp[i][j-1]));
                }
            }
        }
        return dp[m][n];
    }
    
    public int minDistance(String word1, String word2) {
       int m = word1.length();
       int n = word2.length();
       int[][] dp = new int [m+1][n+1];
        return md(word1, word2, m , n ,dp);
    }
}