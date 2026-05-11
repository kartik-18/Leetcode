class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        // String[] s = new String[nums.length];
        // for(int i = 0 ; i < nums.length; i++){
        //     String str = String.valueOf(nums[i]);
        //     for(char c : str.toCharArray()){
        //         list.add(c-'0');
        //     }
        // }

        // int[]res = new int[list.size()];
        // for(int i = 0 ; i < list.size(); i++){
        //     res[i] = list.get(i);
        // }

        for(int i = 0 ; i < nums.length; i++){
            int n = nums[i];
            List<Integer> subList = new ArrayList<>();
            if (n == 0) {
                list.add(0);
                continue;
            }
            while(n != 0){
                int rem = n%10;
                n = n/10;
                subList.add(rem);
            }
            Collections.reverse(subList);
            list.addAll(subList);
        }
        int[]res = new int[list.size()];
        for(int i = 0 ; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}