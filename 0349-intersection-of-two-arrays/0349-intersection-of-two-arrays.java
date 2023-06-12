class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        List <Integer> list = new ArrayList<Integer>();
        
        int i = 0;
        int j = 0;
        int n = nums1.length;
        int m = nums2.length;
        
        while(i<n && j<m){
          if(i>0 && nums1[i] == nums1[i-1]){
              i++;
              continue;
          }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                list.add(nums1[i]);
                i++;
                j++;
               
            }
        }
        
        int [] arr = new int[list.size()];
        for(int k = 0 ; k < list.size() ; k++){
            arr[k] = list.get(k);
        }
        return arr;
    }
}