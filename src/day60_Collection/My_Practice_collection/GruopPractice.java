package day60_Collection.My_Practice_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GruopPractice {
    public static void main(String[] args) {

        List<String> group1 = new ArrayList<>();
        List<String> group2 = new ArrayList<>();
        List<String> group3 = new ArrayList<>();
        List<String> group4 = new ArrayList<>();
        List<String> group5 = new ArrayList<>();

        List<List<String>> groups = new ArrayList<>();
        //groups.addAll(Arrays.asList(group1,group2,group3,group4,group5));

        group1.addAll(Arrays.asList("Alim","Ahmet","Zainep","Maria"));
        group2.addAll(Arrays.asList("Nadire","Nancy","Juliana"));
        group3.addAll(Arrays.asList("Lucy","Roy","Ezmet"));
        group4.addAll(Arrays.asList("Ariana"));
        group5.addAll(Arrays.asList("Nancy"));

        groups.addAll(Arrays.asList(group1,group2,group3,group4,group5));

        System.out.println(groups);

        ArrayList<String> g3 = new ArrayList<>(groups.get(2));
        System.out.println("Group 3: "+g3);

        System.out.println("===============================================");

        List<List<String>> myGroups = new ArrayList<>();
               myGroups.addAll(Arrays.asList(
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>()
               ) );
        System.out.println(myGroups);

        myGroups.get(0).addAll(Arrays.asList("A","B","C","D","E"));
        myGroups.get(1).addAll(Arrays.asList("F","G","H","K","L"));
        myGroups.get(2).addAll(Arrays.asList("M","N","O","P","Q"));
        myGroups.get(3).addAll(Arrays.asList("R","S","T","U","V"));
        myGroups.get(4).addAll(Arrays.asList("W","X","Y","Z","I"));

       /* for (List each : myGroups){
            //System.out.println(each);
            for (Object en : each){
                System.out.println(en);
            }
        }
        */

        for(List<String> eachGroup: myGroups){
            for (String eachName:eachGroup){
                System.out.print(eachName+" ");
            }
        }











    }
}
