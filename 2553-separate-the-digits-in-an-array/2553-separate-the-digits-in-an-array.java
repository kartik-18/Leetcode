class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        // String[] s = new String[nums.length];
        for(int i = 0 ; i < nums.length; i++){
            String str = String.valueOf(nums[i]);
            for(char c : str.toCharArray()){
                list.add(c-'0');
            }
        }

        int[]res = new int[list.size()];
        for(int i = 0 ; i < list.size(); i++){
            res[i] = list.get(i);
        }

        return res;
    }
}