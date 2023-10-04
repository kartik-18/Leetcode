class Solution {
    public int countVowelStrings(int n) {
        int a = 1;
        int e = 1;
        int i = 1;
        int o = 1;
        int u = 1;
        
        for(int k = 1 ; k < n ; k++){
            o = o + u;
            i = o + i;
            e = e + i;
            a = a + e;
        }
        return a+e+i+o+u;
    }
}