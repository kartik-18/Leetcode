class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length-1;
      
        if(matrix == null || matrix.length <1 || matrix[0].length <1){
            return false;
        }
        
        while( i<=matrix.length-1 && j>= 0){
            if(target == matrix[i][j]){
                return true;
            }
            else if(target<matrix[i][j]){
            j--;
        }
             else if(target >matrix[i][j]){
                i++;
            }
        }
        return false;
    }
}