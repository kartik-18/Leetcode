class Solution {
    
    public void pal(int start ,int end, char[] str  ){
        while(start <= end){
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
        
    }
    
    public String reverseStr(String s, int k) {
        char [] str= s.toCharArray();
        
        for(int i = 0 ; i < s.length() ;i += 2*k){
            if(i+k-1 <= str.length-1){
                pal(i , i+k-1 , str );
            }else{
                pal(i,str.length-1,str);
            }
        }
        return new String(str);
    }
}