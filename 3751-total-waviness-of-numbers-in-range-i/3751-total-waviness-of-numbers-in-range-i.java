class Solution {
    public int totalWaviness(int num1, int num2) {
        if(num1 < 100 && num2 < 100)
            return 0;
        int score  = 0;
        for(int i = num1 ; i<= num2 ; i++){
            String num = String.valueOf(i);

            score += calWave(num);
        }

        return score;
    }

    public int calWave(String num){
        int score = 0;
        for(int i = 1 ; i < num.length()-1 ; i++){
            if((num.charAt(i) > num.charAt(i-1) && num.charAt(i) > num.charAt(i+1))
            || (num.charAt(i) < num.charAt(i-1) && num.charAt(i) < num.charAt(i+1)))
                score++;
        }

        return score;
    }
}