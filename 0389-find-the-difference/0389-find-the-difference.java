class Solution {
    public char findTheDifference(String s, String t) {
        char sarr[] = s.toCharArray();
        char tarr[] = t.toCharArray();
        
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        
        s= new String(sarr);
        t= new String(tarr);
        int j = 0;
        for(int i = 0 ; i<s.length() ; i++){
            if(s.charAt(i) != t.charAt(j)){
                return t.charAt(j);
            }
            j++;
        }
        return t.charAt(t.length()-1);
    }
}