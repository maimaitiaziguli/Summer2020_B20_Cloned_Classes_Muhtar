package afinalPractice.localDate;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Birthday {
    public static void main(String[] args) {

//happyBirthday(1984,1,29);
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        LocalDateTime test = time;
        System.out.println(test);
        LocalDateTime test2 = test;
        System.out.println(test2);
        LocalDateTime test3 = today.atTime(12,30,20);
        System.out.println(test3);
        LocalDateTime test4 = LocalDateTime.now();
        System.out.println(test4);
        LocalDate test5 = LocalDate.of(2010,12,21);
        System.out.println("============");
        System.out.println(test5);
        LocalTime test6 = LocalTime.now();
        System.out.println(test6);
    }
/*
    public static void happyBirthday (int year, int month, int day){

        LocalDate today = LocalDate.now();
        int month2 = today.getMonthValue();
        int day2 = today.getDayOfMonth();

        if (month == month2 && day == day2){
            System.out.println("Today is your birthday, Happy birthday!");
        }
        System.out.println("Today is not your birthday");
return;
    }

 */
}
