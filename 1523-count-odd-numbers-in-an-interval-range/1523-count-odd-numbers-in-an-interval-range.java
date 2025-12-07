class Solution {
    public int countOdds(int low, int high) {
        int count = 0;


        // for(int i= low; i<= high; i++){
        //     if(i%2 != 0){
        //         count++;
        //     }
        // }

        int diff = high - low;
        int div = diff / 10;
        int modu = diff % 10;

        int[] arr =  new int[10];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 2;
        arr[4] = 2;
        arr[5] = 3;
        arr[6] = 3;
        arr[7] = 4;
        arr[8] = 4;
        arr[9] = 5;

        count = div * 5 + arr[modu];

        if(low % 2 != 0 && high % 2 != 0)
        return count+1;
        else return count;
    }
}
