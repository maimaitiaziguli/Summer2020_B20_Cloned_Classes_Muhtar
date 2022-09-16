package day61_Maps.myPractice;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class IteratingKeysValues {
    public static void main(String[] args) {

        Map<String, LocalDate> students = new TreeMap<>();
        students.put("Memetjan",LocalDate.of(1984,7,21));
        students.put("Adil",LocalDate.of(2001,12,23));
        students.put("Nancy",LocalDate.of(1995,12,10));

        System.out.println(students.keySet());
        System.out.println(students.values());

        System.out.println("+++++++++++++++++");

        Set set = students.keySet();
        System.out.println(set);

        System.out.println("++++++++++++++++++++");

        for (String each :students.keySet()){
            System.out.println(each);
        }
        for (LocalDate each : students.values()){
            System.out.println(each);
        }







    }

}
