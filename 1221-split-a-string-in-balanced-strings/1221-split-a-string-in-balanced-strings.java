class Solution {
    public int balancedStringSplit(String s) {
        int rs = 0;
        int ls =0;
        int ans =0;
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == 'R') rs++;
            else if(s.charAt(i) == 'L') ls++;
            
            if(rs == ls) {
                rs=0;
                ls=0;
                ans++;
                // System.out.println(ans);
            }
            
        }
        return ans;
    }
}