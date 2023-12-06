class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int rounds = n / 7;
        int monday = 0;
        
        // System.out.println(rounds);
        
        for(int i =  1 ; i <= rounds ; i++){
            monday = i;
            // System.out.println(monday +" "+ sum);
            for(int j = 0 ; j < 7; j++){
                sum += monday;
                monday++;
            }
            
        }
        // System.out.println(sum);
        
        int remain = n - (7 * rounds) ;
        // System.out.println(remain);
        monday = rounds+1;
        // System.out.println(monday);
        for(int i = 0 ; i < remain; i++){
            sum += monday;
            monday++;
            // System.out.println(monday+" "+sum);
        }
        
        return sum;
    }
}