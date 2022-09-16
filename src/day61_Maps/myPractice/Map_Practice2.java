package day61_Maps.myPractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
1. create a map that can contain student name and score
		put 5 of your class mates names and their score
		print out the name of students who made less than 80
 */
public class Map_Practice2 {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();
        students.put("Alim",90);
        students.put("David",76);
        students.put("Imin",85);
        students.put("John",79);
        students.put("Kasim",69);
        students.put("Jesus",74);
        students.put("Elmira",97);
        students.put("Aleen",92);
        students.put("Mikri",95);
        students.put("Ali", 95 );
        students.put("Adam", 93 );
        students.put("Murat", 79 );
        students.put("Cihan", 100);
        students.put("Josh", 71);

        LinkedHashMap<String,Integer> earlyBirds = new LinkedHashMap<>(); // score >= 95
        LinkedHashMap<String,Integer> angryBirds = new LinkedHashMap<>(); // score < 95

        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.values());

        for (String eachKey: students.keySet()){
            Integer eachValue = students.get(eachKey);
            if (eachValue>=95){
                earlyBirds.put(eachKey,eachValue);
            } else {
                angryBirds.put(eachKey,eachValue);
            }

        }

        for (String each :earlyBirds.keySet()){
            System.out.println(each);
        }








    }
}
