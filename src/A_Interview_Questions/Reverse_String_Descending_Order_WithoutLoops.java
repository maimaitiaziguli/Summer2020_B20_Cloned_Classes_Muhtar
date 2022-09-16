package A_Interview_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/*
Write a program that can reverse a string in descending order(string of array, ArrayList);
note: do not use any loop
input: "BCDFEA"
output: FEDCBA
 */
public class Reverse_String_Descending_Order_WithoutLoops {
    public static void main(String[] args) {

        String str = "BCDFEA";
        ArrayList list = new ArrayList();
        list.addAll(Arrays.asList(str.split("")));
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);




       // list.remove("A");
       // list.removeAll(Arrays.asList("A"));
       // System.out.println(list);

       // int a = list.indexOf("C");
       // System.out.println(a);







    }
}
