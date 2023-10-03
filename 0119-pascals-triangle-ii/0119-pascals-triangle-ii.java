class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        int up = rowIndex;
        int down =1;
        long temp =1;
        list.add(1);
        for(int i = 0 ; i < rowIndex ; i++){
            temp = temp * up / down;
            list.add((int)temp);
            up--;
            down++;
        }
        return list;
    }
}