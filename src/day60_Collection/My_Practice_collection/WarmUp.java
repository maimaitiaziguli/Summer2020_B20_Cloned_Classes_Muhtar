package day60_Collection.My_Practice_collection;

import java.util.*;

public class WarmUp {
    public static void main(String[] args) {

     /*
     Write a program that can identify if the two strings are built up same characters.
      */
    String str1 = "aabbssdd";
    String str2 = "abssD";

        Set<String> s1 = new TreeSet<>(Arrays.asList(str1.toUpperCase(Locale.ROOT).split("")));
        System.out.println(s1);
        Set<String> s2 = new TreeSet<>(Arrays.asList(str2.toUpperCase(Locale.ROOT).split("")));
        System.out.println(s2);
        if (s1.equals(s2)){
            System.out.println("Two strings are built up same characters: " + true);
        }else{
            System.out.println("Two strings are built up same characters: "+false);
        }


        System.out.println("Solution 2:");
        Set<String> ss1 = new TreeSet<>(Arrays.asList(str1.split("")));
        String strrr = ss1.toString();
        System.out.println("String: "+strrr);


        System.out.println("===================================");
        // the difference between list and set
        List<Integer> list = new ArrayList<>(Arrays.asList(5,4,1,1,2,3));
        System.out.println("List allows duplicates and preserves insertion order Ex: "+list);

        List<Integer> list2 = new LinkedList<>(Arrays.asList(5,4,1,1,2,3));
        System.out.println("List allows duplicates and preserves insertion order Ex: "+list2);
        List<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(5,4,1,1,2,3));
        System.out.println("List allows duplicates and preserves insertion order Ex: "+stack);


        Set<Integer> set = new HashSet<>(Arrays.asList(5,4,1,1,2,3));
        System.out.println("Set does not allow duplicates and does not preserve insertion order ex: " + set);
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(5,4,1,1,2,3));
        System.out.println("Set does not allow duplicates and does not preserve insertion order ex: " + set2);
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(5,4,1,1,2,3));
        System.out.println("Set does not allow duplicates and does not preserve insertion order ex: " + set3);

        List<Integer> list4 = new Stack<>();
        List<Integer> list5 = new Vector<>(Arrays.asList(1,2,3,9,8,7));
        Vector<Integer> stack1 = new Stack<>();
        stack.addAll(Arrays.asList(1,2,1,3,49,1));
        stack1.addAll(Arrays.asList(9,6,1,4,1,2));
        System.out.println("Stack: "+stack);
        System.out.println("Stack: "+stack1);

        System.out.println("=====================================================");
        String str = new String("Cybertek");
        String str3 = "School";
        // str.concat(str3); we can not modify str because after initialization we can not modify the string.

        StringBuilder strB = new StringBuilder();
        strB.append(str).append(" School").reverse();
        System.out.println(strB);









    }
}
