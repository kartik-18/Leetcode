class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0 ; i < nums.length ; i++){
            set.add(nums[i]);
        }
        int res = 0;
        
        for(int i = 0 ; i<nums.length ; i++){
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