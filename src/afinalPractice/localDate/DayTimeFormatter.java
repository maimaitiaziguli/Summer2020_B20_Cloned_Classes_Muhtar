package afinalPractice.localDate;
import java.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class DayTimeFormatter {
    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEE,hh:mm a,MMM-dd-yyyy");
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today.format(dateTimeFormatter));

        double d1 = Double.parseDouble("8.8");
        System.out.println(d1+1);

        String s = "12";
        int i = Integer.valueOf(s);
        System.out.println(i-2);

        int maxNumber = Integer.max(1,6);
        System.out.println(maxNumber);
        short st = Short.MAX_VALUE;
        System.out.println(st);
        int a = Integer.MAX_VALUE;
        System.out.println("Max number of integer is: " + a);
        int b = Integer.MIN_VALUE;
        System.out.println("Min value of the integer is : " + b);

        Double d = Double.MAX_VALUE;
        System.out.println("The max value of Double is: "+d);
        Double dm = Double.MIN_VALUE;
        System.out.println("The min value of Double is: "+dm);


        System.out.println(Character.isDigit('2'));

        String str = " abcd ";
        String [] arr = str.split("");
        System.out.println(Arrays.toString(arr));

        String sstr = "My wife is my good Friend. ";
        char [] arr2 = sstr.toCharArray();
        String [] arr3 = sstr.split("");
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println("===========================");
        Integer [] list = {1,2,3,4,9};
        System.out.println(Arrays.toString(list));
        System.out.println("==========================");
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(list));
        System.out.println(list1);
       // list1.remove(0);
        list1.add(5,10);
        list1.add(100);
        list1.addAll(Arrays.asList(list));
        System.out.println(list1);
        System.out.println(list1.indexOf(10));
        System.out.println(list1.lastIndexOf(9));
        Collections.sort(list1);
        System.out.println("Sorting the list in ascending order: "+list1);

        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);

        Iterator<Integer> iter = list1.iterator();

        while (iter.hasNext()){
            System.out.print(iter.next()+" ");
        }
    }
}
