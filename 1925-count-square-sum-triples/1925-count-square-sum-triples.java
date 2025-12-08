class Solution {
    public int countTriples(int n) {
        int count = 0;

        for(int i = 1 ; i<= n; i++){
            for(int b = i+1 ; b<=n; b++){
                int sqrSum = i*i + b *b;
                int sqrtRt =(int) Math.sqrt(sqrSum);

                if(sqrtRt * sqrtRt == sqrSum && sqrtRt <= n)
                    count += 2;
            }
        }
        return count;
    }
}