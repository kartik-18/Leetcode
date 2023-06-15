class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int left = 0;
        int top = 0;
        int right = n-1;
        int bottom = n-1;
        int k = 1;
        
        while(top <= bottom && left <= right){
            for(int i = left ; i<= right ;i++){
                res[top][i] = k;
                k++;
            }top++;
            
            for(int i = top ; i <= bottom ; i++){
                res[i][right] = k;
                k++;
            }right--;
            
            if(left <= right){
                 for( int i = right ; i>= left ; i--){
                    res[bottom][i]=k;
                    k++;
                }
                bottom--;
            }
            
            if(top<= bottom){
                for(int i = bottom ; i>= top ; i--){
                    res[i][left] = k;
                    k++;
                }
                left++;
            }
        }
        return res;
    }
}