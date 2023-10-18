class Solution {
    public int minimumSum(int num) {
        int small1 = Integer.MAX_VALUE;
        int small2 = Integer.MAX_VALUE;
        int x =num;
        while(x !=0){
            int rem = x%10;
            if(rem <= small1 && rem<= small2){
                small2 = small1;
                small1 = rem;
            }else if(rem >= small1 && rem<= small2){
                small2 = rem;
            }
            x/=10;
        }
        x = num;
        int large1 = 0;
        int large2 =0;
        
         while(x !=0){
            int rem = x%10;
            if(rem >= large1 && rem>=large2){
                large2 = large1;
                large1 = rem;
            }else if(rem >= large2 && rem<=large1){
                large2 = rem;
            }
            x/=10;
        }
        
        int sum1 = small1*10 + large1;
        int sum2 = small2*10 + large2;
        
        return sum1+sum2;
        
    }
}