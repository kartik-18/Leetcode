class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        int idx = 0;
        int i = 0;
        while(i < m && idx < n){
            if(s.charAt(idx) == t.charAt(i)) {idx++;i++;}
            else{
                i++;
            }
        }
        return idx == n;
    }
}