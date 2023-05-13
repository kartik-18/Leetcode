class Solution {
    public int majorityElement(int[] nums) {
        // nums.sort();
        for(int i =0 ;i<nums.length ; i++){
            int count = 0;
            for (int j = i ; j< nums.length ; j++){
                if(nums[i]==nums[j]){
                    count+=1;
                }
            }

            if(count  > nums.length/2){
                return nums[i];
            }
        }
        return nums[0];
    }
}