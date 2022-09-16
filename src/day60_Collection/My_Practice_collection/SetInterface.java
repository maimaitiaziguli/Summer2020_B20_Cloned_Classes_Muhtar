package day60_Collection.My_Practice_collection;

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new LinkedHashSet<>();
        Set<Integer> s3 = new TreeSet<>();

        s1 .addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,null));  // does not accept duplicates
        System.out.println(s1);
        s1.addAll(Arrays.asList(3,2,10,5,1,7,6,4,7,8,9)); // does not keep the insertion order, sorts the set
        System.out.println(s1);


        s2.addAll(Arrays.asList(10, 1,1,2,9,6,5,4,3,7,8,8,null)); // keeps the insertion order and does not accept duplicates
        s2.add(null);

        System.out.println(s2);

        s3.addAll(Arrays.asList(2,4,3,5,9,7,8,1,10)); // treeSet does not accept null
        System.out.println(s3);


        String str = "CFEBABCDE";
        System.out.println("String: "+str);
        String [] arr = str.split("");
        System.out.println(Arrays.asList(arr));


        Set<String> set1 = new HashSet<>(Arrays.asList(arr));
        System.out.println("HashSet: "+set1);

        Set<String> set2 = new LinkedHashSet<>();
        set2.addAll(Arrays.asList(arr));
        System.out.println("LinkedHashSet: "+set2);

        Set<String> set3 = new TreeSet<>();
        set3.addAll(Arrays.asList(arr));
        System.out.println("TreeSet: "+set3);

int [] arr2 = {6,5,8,7,10,2,3,2,4,4,6};

Set<Integer> hs = new HashSet<>(Arrays.asList());
Set<Integer> lhs = new LinkedHashSet<>();
Set<Integer> trs = new TreeSet<>();





    }
}
