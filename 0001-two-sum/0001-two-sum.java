class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
//         Arrays.sort(nums);
//         int i = 0;
//         int j = nums.length-1;
//         while(nums[i]+nums[j]!=target){
//             if(nums[i]+nums[j]<target){
//                 i=i+1;
//             }
//             if(nums[i]+nums[j]>target){
//                 j=j-1;
//             }
            
//               ans[0]=i;
//               ans[1]=j-1;
//               return ans;
//         }
        for(int i = 0; i<nums.length;i++){
            for(int j =i+1; j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;}
    
}