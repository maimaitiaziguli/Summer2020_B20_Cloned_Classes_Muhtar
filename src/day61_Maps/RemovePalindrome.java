package day61_Maps;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.util.*;

public class RemovePalindrome {
    /*
    1. write a program that can remove the palindrome string from a list of String
                DO NOT use Lambda expressions
     */
    public static void main(String[] args) {
        String[] words = {"Java", "Python", "Level", "Kayak", "Cybertek", "Zaman", "Ana", "Batch20"};

        List<String> list = new ArrayList<>();
        list.addAll( Arrays.asList(words) );

        System.out.println(list);

        Iterator<String> it = list.iterator();

        while (it.hasNext()){
            String each = it.next();
            String reverse = "";
            for (int i = each.length()-1; i >=0; i--){
                reverse += each.charAt(i);
            }
            if (each.equalsIgnoreCase(reverse)){
                it.remove();
            }
        }
        System.out.println(list);



        /*
        Iterator<String> it = list.iterator();

        while( it.hasNext() ){
            String each = it.next(); // "ABC"
            String reverse = "";
            for(int i = each.length()-1; i >= 0; i-- ){
               reverse += each.charAt(i);
            }

            if(each.equalsIgnoreCase(reverse)){
                it.remove();
            }

        }


        System.out.println(list);



         */

        List<String> list10 = new LinkedList<String>();
        List<Iterator>list11 = new ArrayList<>();
        List<Double>list12 = new Vector<>();
        List<Short>list13 =new Stack<>();

        LinkedList<Integer>list1 = new LinkedList<>();
       ArrayList<String>list2 = new ArrayList<>();
       Vector<Double> list3 = new Stack<>();
       Stack<Integer>list4 = new Stack<>();


       Set<Integer>set1 = new LinkedHashSet<>();
       Set<Integer>set2 = new HashSet<>();
       Set<String>set3 = new TreeSet<>();

       HashSet<Integer> hashSet1 = new HashSet<>();
       HashSet<String> hashSet2 = new LinkedHashSet<>();
     //  LinkedHashSet<String> linkedHashSet = new HashSet<>();
    // HashSet<Integer> hashSet3 = new TreeSet<>();





    }


}


