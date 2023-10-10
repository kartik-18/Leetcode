class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
           int l = 0; 

        Arrays.sort(nums); // Sort the input array 'nums' in ascending order

        // Remove duplicates in 'nums' and update 'l' with the modified length
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                continue;
            }
            nums[l++] = nums[i];
        }

        int ans = Integer.MIN_VALUE;
        int j = 0;
        
        for(int i = 0 ; i < l ; i++){
            while(j < l && nums[j] < nums[i]+n)j++;
            int c = j - i;
            ans = Math.max(ans,c);
        }
        return n - ans;
    }
}