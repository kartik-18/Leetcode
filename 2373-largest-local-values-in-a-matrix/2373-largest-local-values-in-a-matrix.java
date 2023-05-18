class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] maxLocal = new int[grid.length -2][grid.length-2];
        for(int i =0; i<grid.length-2; i++){
            for (int j = 0 ; j< grid[i].length-2 ; j++){
                int max =-1;
                for(int p = i ; p< 3+i ; p++){
                    for(int q = j ; q<3+j ; q++){
                        max =Math.max(max,grid[p][q]) ;
                    }
                }
                maxLocal[i][j] = max;
            }
        }
        return maxLocal;
    }
}