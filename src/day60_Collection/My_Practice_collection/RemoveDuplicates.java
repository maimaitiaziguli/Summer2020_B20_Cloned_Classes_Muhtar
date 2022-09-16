package day60_Collection.My_Practice_collection;

import java.util.*;

public class RemoveDuplicates {
    /*
    Task:
    Write a program to remove duplicates from an array.
    first, use a temporary variable
    second without temporary variable
     */
    public static void main(String[] args) {

        String [] names = {"Alim","Nancy" , "Adil","Alim","John","Nancy"};
        //Set<String> s1 = new HashSet<>(Arrays.asList(names));  // this is also works

        System.out.println("======== without temporary variable ==========");

        Set<String> s1 = new TreeSet<>();
        s1.addAll(Arrays.asList(names));
        String s2 = s1.toString();
        s2 = s2.replace("[","").replace(",","").replace("]","");
        System.out.println(s2);

        System.out.println("======== with temporary variable ==========");
       /*
        for (String each : names){
            if (each != each){
                continue;
            }else {
                System.out.println(each);
            }
        }
        */
       // System.out.println(Arrays.toString(names));

        String nonDup ="";
        for (String each : names){
            if (!nonDup.contains(each)){
                nonDup += each +" ";
            }
        }
        System.out.println(nonDup);

        Integer[]numbers = {1,1,1,1,2,2,2,0,0,2,3,3,3,4,5,6,6,6,6,1,1,1,1,2,3};
       numbers = new LinkedHashSet<>(Arrays.asList(numbers)).toArray(new Integer[0]);
       System.out.println(Arrays.toString(numbers));

        System.out.println("================= Lamda ================");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,2,1,4,4,6,7,6,9));
        list.removeIf(p-> p > 5);
        System.out.println(list);













    }
}

