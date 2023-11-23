class Solution {
    
    public boolean f(int []arr){
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        
        for(int i = 2; i< arr.length ; i++){
            if(arr[i] - arr[i-1] != diff) return false;
        }
        return true;
    }
    
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int n = nums.length;
        int m = l.length;
        
        List<Boolean> list = new ArrayList<>();
        
        for(int i = 0 ; i < m ; i++){
            int[]subarr = Arrays.copyOfRange(nums,l[i] , r[i]+1);
            list.add(f(subarr));
        }
        return list;
    }
}