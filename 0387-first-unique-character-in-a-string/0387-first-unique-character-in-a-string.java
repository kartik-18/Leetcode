class Solution {
    public int firstUniqChar(String s) {
        if(s.length() ==1) return 0;
        String temp = s;
        char[]arr = temp.toCharArray();
        Arrays.sort(arr);
        String t  = new String(arr);
        
        // System.out.println(t);
        List<Character> list = new ArrayList<>();
        
        int index = 0 ; 
        if(t.charAt(0) != t.charAt(1)) list.add(t.charAt(0));
        
        for(int i = 1 ; i < t.length()-1; i++){
            
            if(t.charAt(i) != t.charAt(i-1) && t.charAt(i) != t.charAt(i+1) ){
                // System.out.println(t.charAt(i));
                list.add(t.charAt(i));
            }
        }
        if(t.charAt(t.length()-1) != t.charAt(t.length()-2)) list.add(t.charAt(t.length()-1));
        
        index = Integer.MAX_VALUE;
        for(int i = 0 ; i < list.size(); i++){
            for(int j = 0 ; j <  s.length() ; j++){
                if(s.charAt(j) == list.get(i))
                    index = Math.min(index,j);
            }
        }
        if(index == Integer.MAX_VALUE) return -1;
        return index;
    }
}