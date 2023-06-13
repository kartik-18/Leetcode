class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        int i = 0, j = 1;

        while(j < nums.length){
            int currValueDiff = Math.abs(nums[i] - nums[j]);
            int currIndexDiff = Math.abs(i - j);

            if (currValueDiff <= valueDiff && currIndexDiff <= indexDiff){
                return true;
            }

            else if(currIndexDiff == indexDiff || j == nums.length - 1){
                j = ++i;
            }

            j++;
        }

        return false;
    }
}