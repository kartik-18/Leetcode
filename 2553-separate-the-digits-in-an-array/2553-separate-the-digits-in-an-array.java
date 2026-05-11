class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            helper(num, list);
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }

    private void helper(int n, List<Integer> list) {
        if (n >= 10) {
            helper(n / 10, list);
        }

        list.add(n % 10);
    }
}