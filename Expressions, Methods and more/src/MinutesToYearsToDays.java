public class MinutesToYearsToDays {

    public static void main(String[] args) {
        System.out.println(printYearsAndDays(525600));

    }

    public static final String INVALID_MESSAGE_VALUE = "Invalid Value";

    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println(INVALID_MESSAGE_VALUE);
        }

        else{

            long years = minutes/(60*24*365);
            long remainingyears = minutes%(60*24*365);
            long days = remainingyears/(60*24);


            if(days >=365){
                days = 0;
            }
            System.out.println(minutes + " min = " + years + " y and " + days + " d");

        }

    }
}
