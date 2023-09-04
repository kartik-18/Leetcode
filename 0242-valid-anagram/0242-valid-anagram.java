class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        s = new String(arr);
         arr = t.toCharArray();
        Arrays.sort(arr);
        t = new String(arr);
        
        if(s.equals(t))return true;
        return false;
        
        
//         METHOD 2 :- USING HASHMAP
//         Map<Character,Integer> map = new HashMap<>();
//         for(char x : s.toCharArray()){
//             map.put(x,map.getOrDefault(x,0) + 1);
//         }
//         for(char x : t.toCharArray()){
//             map.put(x,map.getOrDefault(x,0) - 1);
//         }
        
//         for(int val : map.values()){
//             if(val != 0)return false;
//         }
        
//         return true;
    }
}