class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer>set = new HashSet<>();
        int prev =  0;
        Arrays.sort(arr);
        if (arr.length == 1)return true;
        if(arr.length == 2){
            if(arr[1]!=arr[0])return false;
            else return true;
            
        }
        
        if(arr[1]!=arr[0])set.add(1);
            
        for(int i = 1; i<arr.length; i++){
            if(arr[i] == arr[i-1])continue;
            else {
                // System.out.println(i+" "+(i-prev));
                if(i == arr.length-1){
                    if(arr[i] != arr[i-1]){
                        if(set.contains(1))return false;
                        else return true;
                    }
                    
                }
                if(set.contains(i-prev) && i!=1)return false;
                set.add(i-prev);
                prev = i;
                
            }
        }
        return true;
    }
}