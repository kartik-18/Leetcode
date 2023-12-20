class Solution {
    public int buyChoco(int[] prices, int money) {
        int ans = money;
        Arrays.sort(prices);
        money -= prices[0];
        money -= prices[1];
        
        if(money < 0) return ans;
        else return money;
    }
}