package afinalPractice.finalMP;

import afinalPractice.localDate.DayTimeFormatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterr {
    public static void main(String[] args) {

        // we create a DateTimeFormatter variable (format)
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE hh:mm a, MMM/dd,yyyy");

LocalDateTime today = LocalDateTime.now();



        System.out.println(today.format(dtf));
// both are good
        String testingTime = today.format(dtf);
        System.out.println(testingTime);






    }

}
