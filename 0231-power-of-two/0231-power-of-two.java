class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n%2 == 0) return isdiv(n/2);
        if(n%2 !=0 && n==1) return true;
        else return false;
    }
    public boolean isdiv(int n){
        if(n == 0) return false;
        if(n%2 == 0) return isdiv(n/2);
        if(n%2 !=0 && n==1) return true;
        else return false;
    }
}