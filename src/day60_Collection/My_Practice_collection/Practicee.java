package day60_Collection.My_Practice_collection;

import java.util.Arrays;
import java.util.TreeSet;

public class Practicee {
    public static void main(String[] args) {

        String str1 = "ababc";
        String str2 = "Abc";
       String s1 = new TreeSet<>(Arrays.asList(str1.split(""))).toString();
       String s2 = new TreeSet<>(Arrays.asList(str2.split(""))).toString();
       boolean result = s1.equalsIgnoreCase(s2);
        System.out.println(result);

String[] arr = {"s","d","s","w","w"};
String arr2 = new TreeSet<>(Arrays.asList(arr)).toString();
        System.out.println(arr2);

    }
}
