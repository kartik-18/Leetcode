class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            set.add(nums[i]);
        }
        int res = 0;
        
        for(int i = 0 ; i<n ; i++){
            if(set.contains(nums[i]-1) == false){
                int cur = 1;
                while(set.contains(nums[i]+cur)){
                    cur++;
                }
                res = Math.max(res,cur);
            }
        }
        return res;
    }
}