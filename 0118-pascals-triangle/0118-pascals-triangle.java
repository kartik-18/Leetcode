class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> rowsList = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++){
            //List<Integer> row = new ArrayList<>();
            //row = retRow(i);
            rowsList.add(retRow(i));
        }
        return rowsList;
    }

    public List<Integer> retRow(int row){
        List<Integer> ans = new ArrayList<>();
        int res = 1;
        ans.add(res);
        for(int i = 1 ; i < row; i++){
            res = res * (row-i);
            res = res/i;
            ans.add(res);
        }
       return ans;
    }
}