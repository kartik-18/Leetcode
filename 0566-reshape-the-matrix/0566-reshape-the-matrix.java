class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        List <Integer> list = new ArrayList<Integer>();
        
        if(r*c != mat.length * mat[0].length){
            return mat;
        }
        for(int i = 0 ; i<mat.length ; i++){
            for (int j = 0 ; j<mat[i].length;j++){
                list.add(mat[i][j]);
            }
        }
        int ind = 0;
        int [][] res = new int[r][c];
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                res[i][j] = list.get(ind);
                ind++;
            }
        }
        return res;
    }
}