class Solution {
    public int lengthOfLastWord(String s) {
        
        String res = s.trim();
        int i = res.length()-1;
        int count = 0;
        if(res.length() == 1){
            return 1;
        }
        while(i > 0 && res.charAt(i) != ' '){
            count++;
            i--;
        }if(i==0){count++;}
        return count;
        
    }
}