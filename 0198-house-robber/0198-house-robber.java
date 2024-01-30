class Solution {
    public int f(int n,int[]nums,int[]dp){
        if(n == 0)return nums[0];
        if(n < 0)return 0;
        if(dp[n] != -1)return dp[n];
        int tk= nums[n]+f(n-2,nums,dp);
        int ntk = f(n-1,nums,dp);
        
        return dp[n] = Math.max(tk,ntk);
    }
    public int rob(int[] nums) {
        if(nums.length == 1)return nums[0];
        if(nums.length == 2)return Math.max(nums[0],nums[1]);
        int []dp = new int[nums.length];
        // Arrays.fill(dp,-1);
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i = 2 ; i < nums.length; i++){
            int tk = nums[i]+dp[i-2];
            int ntk = dp[i-1];
            
            dp[i] = Math.max(tk,ntk);
        }
        // return f(nums.length-1,nums,dp);
        return dp[nums.length-1];
    }
}