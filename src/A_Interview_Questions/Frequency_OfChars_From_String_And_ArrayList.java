package A_Interview_Questions;

import Library.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Frequency_OfChars_From_String_And_ArrayList {

    public static void main(String[] args) {
        String str = "AAABBC";

        ArrayList<String> list = new ArrayList<>();
        list.addAll( Arrays.asList(str.split(""))   );

        /*
        for(String each  : str.split("") ){
            list.add(each);
        }

        System.out.println(list);

         */

        String nonDup = Util.removeDup(str); //"ABC"   to avoid duplication

        for(String each : nonDup.split("")){  // each: A, B, C
            int count =  Collections.frequency(list, each);
            System.out.print(each+count);
        }




    }

}
