class Solution {
    public int maxSatisfaction(int[] s) {
        Arrays.sort(s);
        int n = s.length;
        int start = n -1 ;
        int total = 0;
        for(int i = n-1 ; i>=0 ; i--){
            total += s[i];
            if(total < 0)break;
            start--;
        }
        int k = 1;
        int ans = 0;
        for(int i = start + 1 ; i < n ; i++){
            ans += (k++)*(s[i]);
        }
        return ans;
    }
}