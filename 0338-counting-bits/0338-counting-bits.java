class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for(int i = 0 ; i <= n ; i++){
            res[i] = countBit(i);
        }
        return res;
    }
    
    public int countBit(int n){
        // int temp =new Integer(Integer.toBinaryString(n));
        // return Integer.bitCount(new Integer (Integer.toBinaryString(n)));
        int count = 0;
        while(n > 0 ){
          count += n&1;
            n>>=1;
        }
        return count;
    }
}