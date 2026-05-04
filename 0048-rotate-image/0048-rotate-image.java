class Solution {
    public void rotate(int[][] matrix) {
        int  n = matrix[0].length;
        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int [] row : matrix){
            int i = 0; 
            int j = n-1;

            while(i <= j){
                int temp = row[j];
                row[j] = row[i];
                row[i] = temp;
                i++;
                j--;
            }
        }
        
    }
}