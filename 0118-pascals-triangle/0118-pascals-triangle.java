class Solution {
    
    public List<Integer> generaterow(int row){
        List<Integer> ans = new ArrayList<Integer>();
        ans.add(1);
        int res= 1;
        for(int i = 1; i < row; i++){
            res = res * (row-i);
            res = res / (i);
            ans.add(res);
        }
        return ans;
    }
    
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 1 ; i<= numRows; i++){
            list.add(generaterow(i));
        }
        return list;
    }
}