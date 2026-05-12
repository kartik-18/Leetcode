class Solution {
    public int minimumEffort(int[][] tasks) {
        int l = 0; 
        int r =(int) Math.pow(10,9);
        int res = Integer.MAX_VALUE;

        Arrays.sort(tasks, (a, b) -> b[1] - b[0] - (a[1] - a[0]));

        while(l <= r){
            int mid = l+(r-l)/2;

            if(isPossible(tasks,mid)){
                res=mid;
                r = mid-1;
            }else{
                l = mid+1;
            }
        }

        return res;
    }

    public boolean isPossible(int[][] tasks,int mid){
        for(int[] row : tasks){
            int actual = row[0];
            int required = row[1];

            if(mid < required){
                return false;
            }else{
                mid -= actual;
            }
        }
        return true;
    }
}