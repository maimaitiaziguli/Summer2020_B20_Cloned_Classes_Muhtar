package day62_Maps.myPractice;

import java.util.*;

public class ListOfTheMap {
    public static void main(String[] args) {
        Map<String,String> scrum1 = new LinkedHashMap<>();
        scrum1.put("Alim","SDET");
        scrum1.put("Alex","QA");
        scrum1.put("John","SDET");
        scrum1.put("Nancy","BA");

        Map<String,String> scrum2 = new LinkedHashMap<>();
        scrum2.put("Yusuf","SDET");
        scrum2.put("Lucy","Developer");
        scrum2.put("Math","SDET");
        scrum2.put("Lora","QA");

        Map<String,String> scrum3 = new LinkedHashMap<>();
        scrum3.put("Asker","SDET");
        scrum3.put("Mike","Developer");
        scrum3.put("matt","PO");
        scrum3.put("nasir","BA");

       // List<Map<String,String>> teams = new ArrayList<>(Arrays.asList(scrum1,scrum2,scrum3));
       List<Map<String,String>> teams = new ArrayList<>();
       teams.addAll(Arrays.asList(scrum1,scrum2,scrum3));

        System.out.println(teams);


    }
}
