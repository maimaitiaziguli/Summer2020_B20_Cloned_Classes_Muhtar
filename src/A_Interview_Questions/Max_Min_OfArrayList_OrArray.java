package A_Interview_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Max_Min_OfArrayList_OrArray {
    /*
    Write a program that can find max and min numbers from a ArrayList (or Array) of integers;
     */
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(30,10,25,30,20,15));
        System.out.println(list);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        System.out.println("======================================");
        Collections.sort(list); // sorts the list in ascending order
        System.out.println(list);
    }
}
