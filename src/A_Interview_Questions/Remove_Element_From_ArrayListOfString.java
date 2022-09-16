package A_Interview_Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Element_From_ArrayListOfString {
    /*
    Write a program that can remove all the names named 'Ahmet' from the list of names.
     */
    public static void main(String[] args) {

        // first approach
        /*
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Ahmet","Ahmet","Alim yash","Ezmet Peyzulla"));

        System.out.println(list);

      ArrayList <String> result = new ArrayList<>();

        for (String each: list) {
            if (!each.equals("Ahmet")){
                result.add(each);
            }
        }
        System.out.println(result);

         */

       // second approach --> recommended
/*
ArrayList<String> list2 = new ArrayList<>();
list2.addAll(Arrays.asList("Ahmet Kuchuk","Alim","Ezmet"));

ArrayList<String> result2 = new ArrayList<>();

        for (String each : list2) {
            if (!each.contains("Ahmet")){
                result2.add(each);
            }
        }
        System.out.println(result2);


 */


      // Third approach  --> shortest approach

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Ahmet Kuchuk","Alim","Ezmet"));

        list3.removeAll(Arrays.asList("Ahmet Kuchuk"));
        System.out.println(list3);


    }
}
