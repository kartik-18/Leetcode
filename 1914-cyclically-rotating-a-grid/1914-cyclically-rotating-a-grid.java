class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        int layers = Math.min(m/2,n/2);

        for(int layer = 0 ; layer < layers ; layer++){
            int top = layer;
            int bottom = m-layer-1;
            int left = layer;
            int right = n-layer-1;

            List<Integer> nums = new ArrayList<>();

            for(int i = left ; i <= right ; i++){
                nums.add(grid[top][i]);
            }
            for(int i = top+1 ; i <= bottom-1 ; i++){
                nums.add(grid[i][right]);
            }
            for(int i = right ; i >= left ; i--){
                nums.add(grid[bottom][i]);
            }
            for(int i = bottom-1 ; i >= top+1 ; i--){
                nums.add(grid[i][left]);
            }

            int size = nums.size();
            int normalizedK = k%size;

            Collections.rotate(nums,-normalizedK);
            int idx = 0;
            for(int i = left ; i <= right ; i++){
                grid[top][i] = nums.get(idx++);
            }
            for(int i = top+1 ; i <= bottom-1 ; i++){
                grid[i][right] = nums.get(idx++);
            }
            for(int i = right ; i >= left ; i--){
               grid[bottom][i] = nums.get(idx++);
            }
            for(int i = bottom-1 ; i >= top+1 ; i--){
                grid[i][left] = nums.get(idx++);
            }
        }
        return grid;
    }
}