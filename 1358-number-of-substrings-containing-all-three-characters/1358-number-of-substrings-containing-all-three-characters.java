class Solution {
    public int numberOfSubstrings(String s) {
        int aidx = -1;
        int bidx = -1;
        int cidx = -1;
        
        int res  =0 ;
        
        for(int i = 0 ; i < s.length() ;i++){
            if(s.charAt(i) == 'a') aidx =i;
            else if(s.charAt(i) == 'b') bidx =i;
            else cidx =i;
            
            if(i > 1) res += Math.min(aidx,Math.min(bidx,cidx))+1;
        }
        return res;
    }
}