class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
       boolean[][]dp = new boolean[n][n];
        int start =0;
        int end =0;
        int maxLen =0;
        
        for(int gap = 0 ; gap < n ; gap++){
            for(int i = 0 , j=gap ; j<n; i++,j++){
                if(gap ==0)dp[i][j] = true;
                else if(gap ==1) dp[i][j] = s.charAt(i) == s.charAt(j);
                else{
                    dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i+1][j-1];
                }
                
                if(dp[i][j] && (j-i+1) > maxLen){
                    maxLen = j-i+1;
                    start = i;
                    end = j;
                }
            }
        }
        return s.substring(start,end+1);
    }
}