class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] isVisited = new boolean[n];

        int provinces = 0;

        for(int i = 0 ; i < n ; i++){
            if(!isVisited[i]){
                dfs(isConnected,isVisited,i);
                provinces++;
            }
        }
        return provinces;
    }

    public void dfs(int[][] isConnected, boolean[] isVisited, int city){
        isVisited[city]=true;

        for(int j = 0 ; j < isConnected.length; j++){
            if(isConnected[city][j] == 1 && !isVisited[j]){
                dfs(isConnected,isVisited,j);
            }
        }
    }
}