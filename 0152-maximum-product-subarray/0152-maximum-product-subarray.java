class Solution {
    public int maxProduct(int[] nums) {
        
        int prefix = 1;
        int maxProd = Integer.MIN_VALUE;

        for(int i = 0 ; i < nums.length ; i++){

            prefix *= nums[i];

            maxProd = Math.max(maxProd,prefix);

            if(prefix ==0)
                prefix = 1;
        }

        int suffix =1;

        for(int i = nums.length -1; i>= 0 ; i--){
            suffix *= nums[i];

            maxProd = Math.max(maxProd,suffix);

            if(suffix ==0)
                suffix = 1;
        }
        return maxProd;
    }
}