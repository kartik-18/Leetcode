class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
       
        for(int i = 0 ; i<n-2 ; i++){
            int low = i+1;
            int high = n-1;
            while(low < high){
                int sum = nums[low] + nums[high] + nums[i];
                
                if(sum == target){return sum;}
                else if(sum < target ){low++;}
                else {high--;}
                
                if(Math.abs(sum - target) < Math.abs(res - target)){
                    res = sum;
                }
            }
            
        }
        
        return res;
    }
}