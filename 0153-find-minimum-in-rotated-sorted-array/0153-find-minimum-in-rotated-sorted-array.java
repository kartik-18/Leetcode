class Solution {
    public int findMin(int[] nums) {
        int r = nums.length-1;
        int l =0;

        return bs(l,r,nums);
    }

    public int bs(int l,int r, int[] nums){
        while(r > l){
            int m = l + (r-l)/2;

            if(nums[m] > nums[r]){
                l = m+1;
            }else{
                r = m;
            }
        }
        return nums[l];
    }
}