package A_Interview_Questions;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfSingleChar_String {
    public static void main(String[] args) {

        String str = "aabbccde";
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
           list.add(""+str.charAt(i)) ;
        }

       int frequency =  Collections.frequency(list, "a");
        System.out.println(frequency);







    }
}
