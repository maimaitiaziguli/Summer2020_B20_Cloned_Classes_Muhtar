package day62_Maps.myPractice;

import java.util.*;

/*
1. Write a program that stores the character and frequency of each character from a String
 in to a Map.
	    Ex:
	    	str = "aaabbbccb"
		    output:
		        {a=3, b=4, c=2}
 */
public class FrequencyOfcChars {
    public static void main(String[] args) {

        String str = "aaabbbccbdbhdhdndndn";

        // first create a map object to store the keys and values
        Map<String, Integer> map = new LinkedHashMap<>();

        // then convert the string to a collection type
        List<String> list = Arrays.asList(str.split(""));
        // str.split() ==> split()==> method converts the string to an array.
        // Arrays.asList() method converts the array to collection type

        // second find the frequencies of each key using for loop
        for (String each : list){
           int frequency = Collections.frequency(list, each);
           map.put(each,frequency);
           // or
            // map.put(each,Collections.frequency(list, each));
        }

        System.out.println(map);







        /*
Map<String, Integer> map = new LinkedHashMap<>();

List<String> list = (Arrays.asList(str.split("")));
        System.out.println(list);

        for (String each : list){
            int frequency = Collections.frequency(list,each);
            map.put(each,frequency);
        }
        System.out.println(map);

         */








    }
}
