public class zadanie1 {
    public static void main(String[] args){
        final int MILLISECONDS_PER_SECOND = 1000;  ,SECONDS_PER_MINUTE = 60;,MINUTES_PER_HOUR = 60; ,HOURS_PER_DAY = 24;
        long totalMilliseconds,currentHour, currentMinute, currentSecond,totalSeconds,totalMinutes,totalHours;
        totalMilliseconds = System.currentTimeMillis();
        totalSeconds = totalMilliseconds / MILLISECONDS_PER_SECOND;
        currentSecond = totalSeconds % SECONDS_PER_MINUTE;
        totalMinutes = totalSeconds / SECONDS_PER_MINUTE;
        currentMinute = totalMinutes % MINUTES_PER_HOUR;
        totalHours = totalMinutes / MINUTES_PER_HOUR;
        currentHour = totalHours % HOURS_PER_DAY;
        System.out.println("Текущее время = "+currentHour + ":"+currentMinute + ":"+currentSecond + "GMT");
    }

}
