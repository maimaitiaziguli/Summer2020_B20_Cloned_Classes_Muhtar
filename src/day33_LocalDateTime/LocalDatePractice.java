package day33_LocalDateTime;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDatePractice {
    public static void main(String[] args) {
happyBirthday(6,2,2021);
presentTime();

    }

    public static void happyBirthday (int day, int mouth, int year){
     // LocalDate birthday = LocalDate.of(year,mouth, day);
      LocalDate today = LocalDate.now();
      int month2 = today.getMonthValue();
      int day2 = today.getDayOfMonth();

      if (day == day2 && mouth == month2){
          System.out.println("today is: " + today + " Happy Bithday" );
      return;
      }
        System.out.println("Today is not your birthday");

    }


    private static void presentTime(){
        LocalTime time = LocalTime.now();
        System.out.println(time);
    }





}
