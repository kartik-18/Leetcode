class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int []res = new int[nums1.length];
        int idx = 0;
        for(int i = 0 ; i < nums1.length ; i++){
            int j = 0 ;
            for(; j < nums2.length ; j++){
                if(nums1[i] == nums2[j]) break;
            }
            while(j < nums2.length){
                if(nums2[j] > nums1[i]) {res[idx++] = nums2[j];break;}
                j++;
            }
            if(j == nums2.length) res[idx++] = -1;
        }
        return res;
    }
}