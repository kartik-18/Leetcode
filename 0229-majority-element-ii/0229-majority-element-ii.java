class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List <Integer> result = new ArrayList <Integer> ();
        int res1= 0;
        int res2= 0;
        int count1 = 0;
        int count2 = 0;

        
        if(nums.length == 0){
            return result;
        } 
            
        
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[res1] == nums[i]){
                count1 +=1;
            }
            else if(nums[res2] == nums[i]) {
                count2 += 1;
            }
            else if(count1 == 0){
                res1 = i;
                count1 += 1;
            }
            else if(count2 == 0){
                res2 = i;
                count2 += 1;
            }else{
                count1 -=1;
                count2 -=1;
            }
        }
        
        count1 = 0;
        count2 = 0;
        for(int i = 0 ; i< nums.length ; i++){
            if(nums[i] == nums[res1]){
                count1 +=1;
            }
            else if(nums[i] == nums[res2]){
                count2 +=1;
            }
        }
        if(count1 > nums.length/3){
             result.add(nums[res1]);
        }
        if(count2 > nums.length/3){
         result.add(nums[res2]);
        }
        return result;
    }
}