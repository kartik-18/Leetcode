class Solution {
    public int mySqrt(int x) {
        int i = 1;
        if(x ==0 ){
            return 0;
        }
        while (i <= x/i){
            if(i == x/i){
                return i;
            }
            i+=1;
        }
        return i-1;
    }
}