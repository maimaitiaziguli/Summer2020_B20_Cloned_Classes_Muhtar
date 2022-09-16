package day60_Collection.My_Practice_collection;

import day38_JavaRecap.Collection_Utility;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {

        Iterable<Short> arrayList = new ArrayList<>();
        Iterable<Integer> linkedList = new LinkedList<>();
        Iterable<Integer> vector = new Vector<>();
        Iterable<Integer> stack = new Stack<>();
        Iterable<Integer> hashSet = new HashSet<>();
        Iterable<Integer> linkedHashSet = new LinkedHashSet<>();
        Iterable<Integer> treeSet = new TreeSet<>();

        Collection<String> arrayList1 = new ArrayList<>();
        Collection<Integer> linkedList1 = new LinkedList<>();
        Collection<Integer> vector1 = new Vector<>();
        Collection<Double> stack1 = new Stack<>();
        Collection<String> hashSet1 = new HashSet<>();
        Collection<Short> linkedHashSet1 = new LinkedHashSet<>();
        Collection<String> treeSet1 = new TreeSet<>();

        List<Integer> arrayList2 = new ArrayList<>();
        List<Short> linkedList2 = new LinkedList<>();
        List<Integer> vector2 = new Vector<>();
        List<Integer> stack2 = new Stack<>();


        System.out.println("==========================================================");
        ArrayList<Integer> arrayList3= new ArrayList<>();
        LinkedList<Short> linkedList3 = new LinkedList<>();
        Vector<Byte> vector3 = new Vector<>();

        Vector<Byte> stack3 = new Stack<>();


        System.out.println("==========================================================");
        Set<Byte> hashSet2 = new HashSet<>();
        Set<Short> linkedHashSet2 = new LinkedHashSet<>();
        Set<Integer> treeSet2 = new TreeSet<>();

        SortedSet<Integer> treeSet3 = new TreeSet<>();

        treeSet3.addAll(Arrays.asList(3,4,5,1,7));
        treeSet3.add(99);
        treeSet3.remove(4);
        treeSet2.addAll(Arrays.asList(99,17));
        //treeSet3.clear();
        //treeSet3.contains(99);
        System.out.println(treeSet3.contains(99));
        System.out.println("bbb"+ treeSet3.containsAll(treeSet2));

        System.out.println("TreeSet3: "+treeSet3);
        System.out.println("TreeSet2: "+treeSet2);
        treeSet3.addAll(treeSet2);
        System.out.println("Combination of tree set 2 and 3: "+treeSet3);

        System.out.println("Contains method: "+ treeSet3.containsAll(treeSet2));

        // equals()
        System.out.println("equals method: "+ treeSet3.equals(treeSet2));

       // System.out.println("Iterator: "+treeSet3.iterator() );
        treeSet3.removeAll(treeSet2);
        System.out.println("Remove method: "+ treeSet3);
        treeSet3.remove(3);
        System.out.println(treeSet3);

        treeSet3.addAll(treeSet2);
        System.out.println("TreeSet3: " + treeSet3);

        treeSet3.retainAll(treeSet2);

        System.out.println("RetainAll method: " + treeSet3);


        System.out.println(treeSet3.size());
         treeSet3.toArray();
        System.out.println("To array method: "+ treeSet3);

        arrayList2.addAll(Arrays.asList(1,2,3,3,4,5));
        System.out.println("get() is only for arrayList in collection-->  "+arrayList2.get(3));

     vector2.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("get() with vector--> "+vector2.get(1));


        vector1.addAll(Arrays.asList(1,3,4,5));
        vector1.retainAll(Arrays.asList(1,3));
        System.out.println("vector with retainAll(): "+ vector1);


        vector2.set(4,20);
        System.out.println(vector2);
      //  treeSet3.iterator();
     //  Iterable<Integer> iterator = new TreeSet<>(treeSet3);





/*
Collection Methods:
add(Object)
	         This method is used to add an object to the collection.
addAll(Collection c)
             This method adds all the elements in the given collection to this collection.
clear()	--> void
             This method removes all of the elements from this collection.

contains(Object o)	--> boolean
             This method returns true if the collection contains the specified element.
containsAll(Collection c) --> boolean
	         This method returns true if the collection contains all of the elements in the given collection.
equals(Object o) --> boolean
	         This method compares the specified object with this collection for equality.
equals(Collection c) --> boolean
	         This method compares the specified collection with another collection for equality.
isEmpty() --> boolean
             This method returns true if this collection contains no elements.
iterator()
             This method returns an iterator over the elements in this collection.

remove(Object o)
	         This method is used to remove the given object from the collection. If there are duplicate values, then this method removes the first occurrence of the object.
removeAll(Collection c)
             This method is used to remove all the objects mentioned in the given collection from the collection.
removeIf(Predicate filter)
             This method is used to remove all the elements of this collection that satisfy the given predicate.
retainAll(Collection c)
             This method is used to retain only the elements in this collection that are contained in the specified collection.
size()	--> int
             This method is used to return the number of elements in the collection.
toArray()
            This method converts collection to array. is used to return an array containing all of the elements in this collection.


Iterator Methods:
next()
             it returns the element and moves to the next element.
hasNext() --> boolean
             It returns true if the iterator has more elements. otherwise it returns false.
remove()     it removes the last element returned by the iterator. (it is less used)



 */

       /* list of list
          list of list --> A list contains multiple list
        */
ArrayList<ArrayList<Integer>>l1 = new ArrayList<>();
ArrayList<Integer>l2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
ArrayList<Integer>l3 = new ArrayList<>(Arrays.asList(11,22,33,44,55));
        System.out.println("l2 : "+ l2);
        System.out.println("l3 : "+ l3);
       l1.add(l2);
        l1.add(l3);
        System.out.println("l2 and l3 added to l1: "+l1);

        l1.get(0);
        System.out.println(l1);
        System.out.println(l1.get(0));
        l1.add(new ArrayList<>());
        l1.get(2).addAll(Arrays.asList(6,7,8,9));

        System.out.println(l1);
        System.out.println(l1.size());


    }
}
