class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reflect(matrix);
        
    }
    
    public void transpose(int[][] matrix){
        for(int i = 0; i<matrix.length ; i++){
            for(int j = i+1 ; j < matrix.length ;j++){
                int temp = matrix [i][j];
                 matrix [i][j] = matrix[j][i];
                 matrix [j][i] = temp;
            }
        }
    }
     public void reflect(int[][] matrix){
         int c = matrix.length;
        
        for(int i = 0 ; i < c ; i++){
            for(int j = 0 ; j< c/2 ; j++){
                int temp = matrix [i][j];
                 matrix [i][j] = matrix[i][c-j-1];
                 matrix [i][c-j-1] = temp;
            }
        }
     }
}