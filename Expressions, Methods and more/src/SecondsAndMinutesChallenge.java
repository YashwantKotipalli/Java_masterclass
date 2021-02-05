public class SecondsAndMinutesChallenge {


    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args) {

        System.out.println(getDurationString(65,9));
        System.out.println(getDurationString(3909L));
    }

    private static String getDurationString(long min, long sec) {

        if((min<0) || (sec<0) || (sec>59)){
            return INVALID_VALUE_MESSAGE;
        }

        long hour = min/60;
        long remainingminutes = min%60;
        String hoursString = hour + "h ";
        if(hour < 10){
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingminutes + "m ";
        if(remainingminutes <10){
            minutesString = "0" + minutesString;
        }

        String secondsString = sec + "s ";
        if(sec<10){
            secondsString = "0" + secondsString;
        }
        return hoursString + minutesString + secondsString;


    }

    private static String getDurationString(long sec){

        if(sec>=0){

            long min = sec/60;
            long remainingsecs = sec%60;
            return getDurationString(min, remainingsecs);

        }
        return INVALID_VALUE_MESSAGE;

    }


}
