class Solution {
    public int jump(int[] nums) {
        int jumps =0;
        int cur =0;
        int far = 0;
        
        int n = nums.length;
        
        for(int i = 0 ; i < n-1 ; i++){
            far = Math.max(far,i+nums[i]);
           if(i == cur) {cur = far;jumps++;}
        }
        return jumps;
    }
}