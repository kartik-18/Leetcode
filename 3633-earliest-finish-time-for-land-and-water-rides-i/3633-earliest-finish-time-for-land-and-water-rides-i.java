class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int res = Integer.MAX_VALUE;

        for(int i = 0 ; i < landStartTime.length ; i++){
            for(int j = 0 ; j < waterStartTime.length ; j++){

                // For land first
                int landFinish = landStartTime[i]+landDuration[i];
                int waterstart = Math.max(landFinish,waterStartTime[j]);
                int finish1 = waterstart + waterDuration[j];

                // Water first
                int waterFinish = waterStartTime[j] + waterDuration[j];
                int landStart = Math.max(waterFinish, landStartTime[i]);
                int finish2 = landStart + landDuration[i];

                res = Math.min(res, Math.min(finish1 , finish2)); 
            }
        }
        return res;
    }
}