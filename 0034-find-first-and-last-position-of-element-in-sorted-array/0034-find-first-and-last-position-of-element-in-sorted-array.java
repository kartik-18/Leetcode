class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int [] res = new int[2];
        
        while(left <= right){
            if(target == nums[left]){
                res[0]= left;
                
                while(left < right){
                     if(target == nums[right]){
                         res[1]= right;
                         return res;
                    }
                    else{
                        right -=1;
                    }
                }
                res[1]= left;
                return res;
                
            }
            else if(nums[left] < target){
                left +=1;
            }
            else if(nums[right] > target){
                right -=1;
            }
           
        }
        return new int[] {-1,-1};
    }
}