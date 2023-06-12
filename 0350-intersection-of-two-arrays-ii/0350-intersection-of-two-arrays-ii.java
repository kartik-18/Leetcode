class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList<Integer>();
        int m = nums1.length;
        int n = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        while(i<m && j <n){
           if(nums1[i] > nums2[j]){
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            
            else if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        
        int[]arr = new int[list.size()];
        for(int k = 0; k< list.size() ; k++){
            arr[k] = list.get(k);
        }
        
        return arr;
    }
}