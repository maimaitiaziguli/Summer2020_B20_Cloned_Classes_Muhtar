package day62_Maps.myPractice;

import java.time.LocalDate;
import java.util.*;

/*
2. write a program that stores the unique characters from a string into a map.
        Ex:
        	str = "abacbdeef";
        	output:
            	{c=1, d=1, f=1}
 */
public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "abacbdeefmnbvcpxvwq";

      /*  // first create a map to store the unique characters in the map.
        Map<String , Integer> map = new LinkedHashMap<>();

        // Then convert the string in to a collection type.
        List<String> list = Arrays.asList(str.split(""));
        // split() method converts the string to array, Arrays.asList() converts the array to a collection type


        // use for loop to iterate each element in the list
        for (String each : list){
            if (Collections.frequency(list,each) == 1){ // checks the frequency of each element
                map.put(each,Collections.frequency(list,each)); // adds the unique characters to the map
            }
        }
        System.out.println(map);






        System.out.println(map.containsValue(7));
        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.remove("d"));
        System.out.println(map.keySet());

       */

        Map<String , Integer> map = new LinkedHashMap<>();
        List<String>list = Arrays.asList(str.split(""));
        for (String each : list){
            if (Collections.frequency(list,each)==1){
                map.put(each,Collections.frequency(list,each));
            }
        }
        System.out.println(map);

        System.out.println("===================================================");
  /*
  write a program that can print the unique characters from a String ( or list of String)
   */
        System.out.println(str);
        List<String> list1 = Arrays.asList(str.split(""));

        String  uniques ="";
        for (String each : list){
            if (Collections.frequency(list1,each) == 1){
                 uniques += each;
            }
        }
        System.out.println("unipue characters : "+uniques);


        System.out.println("==========================");

        // entrySet()

        Map<String, LocalDate>  dateOfBirth = new LinkedHashMap<>();
        dateOfBirth.put("mike", LocalDate.of(1990,9,12));
        dateOfBirth.put("mikel", LocalDate.of(1960,9,12));
        dateOfBirth.put("mikell", LocalDate.of(1970,9,12));
        System.out.println(dateOfBirth.entrySet()) ;
        System.out.println(dateOfBirth.keySet());
        System.out.println(dateOfBirth.values());
        System.out.println(dateOfBirth.isEmpty());
        System.out.println(dateOfBirth.containsKey("mike"));
        System.out.println(dateOfBirth.containsValue(LocalDate.of(1990,9,12)));



    }

}
