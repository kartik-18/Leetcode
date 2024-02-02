class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s = "123456789";
        List<Integer>list = new ArrayList<>();
        for(int i = 0 ; i < s.length(); i++){
            for(int j = i; j < s.length() ; j++){
                if(Integer.parseInt(s.substring(i,j+1)) >= low && Integer.parseInt(s.substring(i,j+1)) <= high){
                    list.add(Integer.parseInt(s.substring(i,j+1)));
                }
            }
        }

       Collections.sort(list);
        return list;    
    }
}