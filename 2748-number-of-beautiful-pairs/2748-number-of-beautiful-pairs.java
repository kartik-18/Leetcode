class Solution {
    public int countBeautifulPairs(int[] nums) {
        int count = 0;
        for(int i = 0 ; i < nums.length; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                
                while(nums[i] >= 10){
                    nums[i] /= 10;
                }
                if(gcd(nums[i] , nums[j]%10) == 1) count++;
            }
        }
        return count;
        
    }
    public int gcd(int n, int m){
        while(m!=n){
            
        
        if(m > n){
            m = m - n;
        }else if (n > m){
            n = n - m;
        }}
        
        return n;
    }
}