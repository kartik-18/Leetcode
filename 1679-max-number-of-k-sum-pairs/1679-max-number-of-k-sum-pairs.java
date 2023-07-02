class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;
        int res = 0;
        // if(nums[start] > k){return -1;}
        
        while(start < end){
            if(nums[start] + nums[end] == k){
                res++;
                start++;
                end--;
            }else if(nums[start] + nums[end] > k){
                end--;
            }else if(nums[start] + nums[end] < k){
                start++;
            }
        }
        return res;
    }
}