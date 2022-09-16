package day61_Maps.myPractice;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {

        Map<String , Integer> map1 = new LinkedHashMap<>();// keeps the insertion order as it is

        Map<Integer, Double> map2 = new HashMap<>();// random

        Map<String , Integer> map3 = new Hashtable<>();// it is synchronized , thread safe

        Map<String, Integer> map4 = new TreeMap<>(); // always Sorted

        System.out.println("=====================================================");

        Map<String , Double > employees = new LinkedHashMap<>();
        employees.put("Memetjan",175000.0);
        employees.put("Nancy",158000.0);
        employees.put("Ashvk",145000.0);
        System.out.println(employees);




        map1.put("Memetjan", 120);
        map2.put(1,120.0);
        System.out.println(map1);
        System.out.println(map1.get("Memetjan"));
        System.out.println(map3);






    }
}
