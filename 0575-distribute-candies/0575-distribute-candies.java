class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer>set = new HashSet<>();
        for(int x : candyType){
            set.add(x);
        }
        int n = candyType.length/2;
        if(n == set.size())return set.size();
        else if(n < set.size()) return n;
        else return set.size();
    }
}