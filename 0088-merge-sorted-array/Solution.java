class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // NAIVE SOLUTION

        for (int i = m, j = 0; j < n; j++) {
            nums1[i] = nums2[j];
            i += 1;
        }
        Arrays.sort(nums1);
    }
}