class Solution {
    public int[] maxValue(int[] nums) {
        // when left to right iterate --> 
        int n = nums.length;
        int[] maxLeft = new int[n];
        int[] minRight = new int[n];

        int[] ans = new int[n];

        // int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        maxLeft[0] = nums[0];
        for(int i = 1 ; i < n ; i++){
            maxLeft[i] = Math.max(nums[i],maxLeft[i-1]);
        }
        // minRight[n-1] = nums[n-1];
        // for(int i = n-2 ; i >=0 ; i--){
        //     if(minLeft[i] > minMum)
        //     minRight[i] = Math.min(nums[i], minRight[i+1]);
        // }
        // ans[n-1] = maxLeft[n-1];
        for(int i = n-1 ; i >= 0 ; i--){
            if(maxLeft[i] > minNum){
                ans[i] = ans[i+1];
            }else{
                ans[i] = maxLeft[i];
            }

            minNum = Math.min(minNum,nums[i]);
        }
    return ans;
    }
}