class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet <Integer> set = new HashSet<Integer>();
         for(int i = 0 ; i < nums.length ; i++){
            set.add(nums[i]);
        }
        
        for(int i = 0 ; i < nums.length ; i++){
            int x = nums[i];
            int sum = 0;
            while(x != 0){
                int rem = x%10;
                sum = sum * 10+ rem ;
                x=x/10;
            }
           set.add(sum);
        }
        
        return set.size();
    }
}