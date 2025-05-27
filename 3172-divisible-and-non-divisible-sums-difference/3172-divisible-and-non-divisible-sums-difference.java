class Solution {
    public int differenceOfSums(int n, int m) {
        int div = 0;
        int notDiv = 0;
        for(int i = 1 ; i<= n ; i++){
            if( i % m != 0)
                notDiv+=i;
            if( i % m == 0) 
                div+= i;
        }

        return notDiv - div;
    }
}