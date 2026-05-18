class Solution {

    class Pair{
        public int first;
        public int second;

        public Pair(int first, int second){
            this.first = first;
            this.second =second;
        }
    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][]visited = new int[n][m];
        int cnt = 0 ;

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j ++){
                if(visited[i][j] == 0 && grid[i][j] =='1'){
                    cnt++;
                    bfs(i,j,visited,grid);
                }
            }
        }
        return cnt;
    }

    public void bfs(int i, int j ,int[][]visited,char[][] grid){
        Queue<Pair> que = new LinkedList<Pair>();
        visited[i][j] = 1;
        que.add(new Pair(i,j));
        int n = grid.length;
        int m = grid[0].length;
        while(!que.isEmpty()){
           Pair curr = que.poll();
            int row = curr.first;
            int col = curr.second;

        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};

            for (int k = 0; k < 4; k++) {

                int nRow = row + delRow[k];
                int nCol = col + delCol[k];

                    if(nRow >= 0 && nRow < n && nCol >= 0 && nCol < m 
                    && visited[nRow][nCol] == 0 && grid[nRow][nCol] == '1'){
                        que.add( new Pair(nRow,nCol));
                        visited[nRow][nCol] = 1;
                    }
                }
            
        }
    }
}