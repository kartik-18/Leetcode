class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
//         we will use sliding window of and insert the items into hasset and if the adding of element in hashset gave us false that means there was already a elemnt whch is equal to current elemnt and also it is in the window
        
        Set<Integer> set = new HashSet<Integer>();
        int i = 0 ; 
        for(int j = 0 ; j < nums.length ; j++){
            if(set.add(nums[j]) == false){
                return true;
            }
            if(set.size() >= k+1){
                set.remove(nums[i++]);
            }
        }
        return false;
    }
}