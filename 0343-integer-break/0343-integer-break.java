class Solution {
    public int integerBreak(int n) {
        if(n <= 3) return n-1;
        int quotient = n / 3;
        int rem = n % 3;
        return n%3 == 0 ? (int)Math.pow(3,quotient) : 
            (n%3 == 1 ? (int)Math.pow(3,quotient - 1) * 4 : (int)Math.pow(3,quotient) *2);
    }
}