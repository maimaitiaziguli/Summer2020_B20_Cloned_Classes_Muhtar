package day60_Collection.My_Practice_collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ListOfTheList {

    public static void main(String[] args) {

     int[]arr = {1,2,3,3,4,5};
     int[][]arr2 = {{1,2,3,4,5},{6,7,8,9,}};
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int eachOb :arr){
            System.out.print(eachOb+" ");
        }

        System.out.println();

        for (int [] each :arr2){
            for (int e:each){
                System.out.print(e+" ");
            }
        }









    }
}
