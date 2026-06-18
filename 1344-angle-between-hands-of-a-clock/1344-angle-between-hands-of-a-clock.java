class Solution {
    public double angleClock(int hour, int minutes) {

       // 1 hour -- 60min

       // 360 /12 -- 30 degree per hour
       // 30 degree -- 60 min
       // 1 degree -- 2min 

        // 60 min - 360 degree
        // 1 min -- 6 degree

       double minAngle = 6 * minutes;
       double hourAngle = 30 *(hour%12) + 0.5 * minutes;
        double diff = Math.abs(minAngle - hourAngle);

        return Math.min(diff , 360-diff);
    }
}