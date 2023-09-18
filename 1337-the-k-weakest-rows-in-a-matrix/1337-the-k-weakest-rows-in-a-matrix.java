class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] ones = new int[mat.length][2];
        int[]res = new int[k];
        for(int i = 0 ; i < mat.length; i++){
            int count = 0;
            for(int  j = 0 ; j < mat[i].length; j++){
                count += mat[i][j];
            }
            ones[i][0] = count;
            ones[i][1] = i;
        }
        
        Arrays.sort(ones, (a,b) -> a[0] == b[0] ? a[1] -b[1] : a[0] -b[0]);
        for(int i = 0 ; i < k ; i++){
            res[i] = ones[i][1];
        }
        return res;
    }
}