class Solution {
    
    public int f(int i, int j,int[][]arr,int[][]dp){
        if( i == 0 && j == 0)return 1;
        if(i< 0 || j < 0)return 0;
          int left =0;
          int up = 0;

        if(dp[i][j] != -1)return dp[i][j];
        
         if(i >0 && arr[i-1][j] != 1){
             up = f(i-1,j,arr,dp);
        }
        if(i == 0){
            up = f(i-1,j,arr,dp);
        }
        
        
        if(j >0 && arr[i][j-1] != 1){
           left = f(i,j-1,arr,dp);
        }
        
        if(j == 0){
            left = f(i,j-1,arr,dp);
        }

        return dp[i][j]=up+left;
    }
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][]dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int[]row : dp){
            Arrays.fill(row,-1);
        }
        if(obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1] == 1)return 0;
        return f(obstacleGrid.length-1,obstacleGrid[0].length-1,obstacleGrid,dp);
    }
}