class Solution {
    public int findMin(int[] nums) {
        //Approach: Using Binary Search Algorithm, T.C: O(logn), S.C: O(1)

        int res = nums[0];
        int left = 0, right = nums.length-1;

        //traverse
        while(left<=right){
            //how we know the res
            if(nums[left]<nums[right]){
                res = Math.min(res, nums[left]);
                break;
            }
            int mid = (left+right)/2;
            res = Math.min(res, nums[mid]);
            if(nums[mid]>=nums[left]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return res;
    }
}