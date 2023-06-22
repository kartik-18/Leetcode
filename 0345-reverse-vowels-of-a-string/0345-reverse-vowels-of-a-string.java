class Solution {
    public String reverseVowels(String s) {
        if(s== null || s.length() == 0)return s;
        String vowels = "aeiouAEIOU";
        int start = 0;
        int end = s.length()-1;
        char[] res = s.toCharArray();
        
        while(start < end){
            while(start < end && !vowels.contains(res[start]+"")){
                start++;
            }
            while(start < end && !vowels.contains(res[end]+"")){
                end--;
            }
            
            char temp = res[start];
            res[start]  = res[end];
            res[end] = temp;
            
            start++;
            end--;
        }
        return new String(res);
    }
}