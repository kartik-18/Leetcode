class Solution {
    public int longestPalindrome(String s) {
        int res =0;
        HashSet<Character>set = new HashSet<>();
        for(int i = 0 ; i < s.length() ;i++){
            if(set.contains(s.charAt(i))){
                res+=2;
                set.remove(s.charAt(i));
            }else{
                set.add(s.charAt(i));
            }
        }
        if(set.size()>0)res++;
        return res;
    }
}