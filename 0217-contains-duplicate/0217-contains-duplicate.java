class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            if(set.contains(n))
                return true;
            set.add(n);
        }
        if(set.size() < nums.length)
            return true;
        else
            return false;
    }
}