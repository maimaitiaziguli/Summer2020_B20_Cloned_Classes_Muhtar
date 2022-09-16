package afinalPractice.methodOverLoading;

import Library.Util;

public class Test {
    public static void main(String[] args) {
       MyCustomMethods.nameFormat("aRZiguL"," PEYzulla");

       int a =  Util.frequency("ssbbd",'s');
        System.out.println(a);

        System.out.println(" Calculation");

       MyCustomMethods.calculator(19,'/',5);


        System.out.println("Addition method");
       Overloading.addition(2.1,2.9);

       Overloading.addition(10,15,20);
    }
}
