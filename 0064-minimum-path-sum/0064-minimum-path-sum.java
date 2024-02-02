class Solution {
    
   
    public int f(int i, int j,int[][]grid,int[][]dp){
        // if(i < 0 || j < 0)return 0;
        if(i == 0 && j == 0)return grid[0][0];
        if(dp[i][j] != -1) return dp[i][j];
        
        int left = Integer.MAX_VALUE;
        int up = Integer.MAX_VALUE;

          if(i>0) up = grid[i][j]+ f(i-1,j,grid,dp);
        if(j>0) left = grid[i][j]+ f(i,j-1,grid,dp);
      
        
        return dp[i][j] = Math.min(left,up);
    }
    
    public int minPathSum(int[][] grid) {
        int[][]dp = new int[grid.length][grid[0].length];
        for(int[] row:dp)Arrays.fill(row,-1);
        return f(grid.length-1,grid[0].length-1,grid,dp);
    }
}