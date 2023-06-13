class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int i = nums.length-1;
        int res = 0;
        if(nums.length <3 ){
            return nums[i];
        }
        while(i>0){
            
            if( nums[i-1] != nums[i] ){
                res++;  
            }
            
            if(res == 3){
                return nums[i];
            }   
            
            i--;
        }
        
        if(i==0 &&  res==2){
         return nums[0];    
        }
        
        return nums[nums.length-1];
        
        
    }
}