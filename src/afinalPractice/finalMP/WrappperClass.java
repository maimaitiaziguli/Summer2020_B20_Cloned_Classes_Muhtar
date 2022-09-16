package afinalPractice.finalMP;

import java.util.ArrayList;
import java.util.Arrays;

public class WrappperClass {
    public static void main(String[] args) {

     String stringAsNumber = "2020";
        System.out.println(stringAsNumber+1); // 20201

        int number = Integer.parseInt(stringAsNumber);
        System.out.println(number+1);  // 2021

        double dNumber = Double.parseDouble(stringAsNumber);
        System.out.println(dNumber);     //  2020.0

        Double d1 = Double.parseDouble("7.5");
        System.out.println(d1-1); // 6.5


        String s1 = "true";
        boolean b1 = Boolean.parseBoolean(s1);
        System.out.println(b1); // true

        String s2 = "false";
        boolean b2 = Boolean.valueOf(s2);
        System.out.println(b2);

        String s3 = "10";
        Integer num =  Integer.valueOf(s3);
        System.out.println(num+1); //11

        String s4 = "99";
        Integer num2 = Integer.parseInt(s4);
        System.out.println(num2+1);  // 100

        int n = 110;
        Integer b = n;
         int n2 = b;
        System.out.println(n2);

        System.out.println("=======================");
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        System.out.println(min);
        System.out.println(max);

        byte minB = Byte.MIN_VALUE;
        byte maxB = Byte.MAX_VALUE;
        System.out.println(minB);
        System.out.println(maxB);

        Double minD = Double.MIN_VALUE;
        System.out.println(minD);

        double d = 1;
        Double d4 = 1.0;


        Integer [] arr = {1,2,3,4};
        int [] arrr  = {1,2,3,4};

        double [] darr  = {1,2,3,4};
        Double [] Darr = {1.0,2.0,3.0,4.0,};


       // ArrayList<int> list = new ArrayList<int>();   ArrayList does not accept primitives
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));
        System.out.println(list);


String str = "mnb";
char [] carr = str.toCharArray();
        System.out.println(Arrays.toString(carr));

    }
}
