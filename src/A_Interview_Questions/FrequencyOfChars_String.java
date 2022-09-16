package A_Interview_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfChars_String {
    /*
    Write a program that can find the frequency of characters from a string.
    DO NOY use nested loop
    "AABBCCDDEE" ==> "ABCDE"
    output: A2B2C3D2E2
     */

    public static void main(String[] args) {


       String str = "AABBCCDDEE";

       // lets create an ArrayList to store the string value
        ArrayList<String> list = new ArrayList<>();

        // convert the string value into Array and convert the
        // Array to ArrayList and store it into list
        list.addAll(Arrays.asList(str.split("")));

        // create a string variable to store the result
        String result = "";
        // create a String variable to store non duplicate characters
        String nonDup = "";

        // lets loop the list
        for (String each :list ) {
           int frequency =  Collections.frequency(list,each); // finds the frequency of ech element in the list
           if (!nonDup.contains(each)){   // finds the non duplicated characters
               nonDup+=each;
               result+= each+frequency;
           }
        }

        System.out.println(result);








    }

}
