class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int res = 0;
        
        while(left < right){
            int area = Math.min(height[left],height[right]) * (right - left);
            res = Math.max(res,area);
            if(height[left] < height[right]){
                left += 1;
            }
            else if(height[left] > height[right]){
                right -= 1;
            }
            else{
                left += 1;
                right -= 1;
            }
        }
        return res;
    }
}