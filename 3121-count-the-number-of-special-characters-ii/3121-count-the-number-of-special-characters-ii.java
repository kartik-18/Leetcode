class Solution {
    public int numberOfSpecialChars(String word) {
       int[] lowerlast = new int[26];
       int[] upperfirst = new int[26];
        Arrays.fill(lowerlast,-1);
        Arrays.fill(upperfirst,-1);

       for(int i = 0 ; i < word.length() ; i++){
        char c = word.charAt(i);
        if(Character.isLowerCase(c))
            lowerlast[c - 'a'] = i;

        if(Character.isUpperCase(c) && upperfirst[ c - 'A'] == -1)
            upperfirst[c-'A'] = i;
       }

       int count = 0 ;

       for(int i = 0; i < 26 ; i++){
        if(lowerlast[i] != -1 && upperfirst[i] != -1 && lowerlast[i] < upperfirst[i])
            count++;
       }

       return count;
    }
}