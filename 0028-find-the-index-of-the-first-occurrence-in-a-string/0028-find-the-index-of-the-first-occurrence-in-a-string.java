class Solution {
    public int strStr(String haystack, String needle) {
    if(haystack.length()>=needle.length()){
         for(int i = 0 ; i<haystack.length()-needle.length()+1;i++){
             int j =0;
            for( ; j<needle.length();j++){
                
            }
             if(haystack.substring(i,i+j).equals(needle)){
                    return i;
            }
        }
    }
        return -1;
       
    }
}