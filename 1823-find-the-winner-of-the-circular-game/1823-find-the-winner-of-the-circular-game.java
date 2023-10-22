class Solution {
    public int findTheWinner(int n, int k) {
        return cal(n,k)+1;
    }
    
    public int cal(int n, int k){
        
        if(n ==1){
            return 0;
        }
        return (cal(n-1,k)+k) % n;
        
    }
}