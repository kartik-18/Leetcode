class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int res = 0;
        int count = 0;

        if(cost.length == 1)
            return cost[0];
        if(cost.length == 2)
            return cost[0]+cost[1];

        for(int i = cost.length -1 ; i >= 0 ; i--){
            count++;
            if(count %3 != 0)
                res += cost[i];
        }

        return res;
    }
}