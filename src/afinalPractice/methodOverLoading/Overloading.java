package afinalPractice.methodOverLoading;

import java.util.Arrays;

public class Overloading {


    public static int addition (int a, int b){
        int result = a+b;
        System.out.println(result);
        return result;
    }
    public static int addition (int a, int b, int c){
        int result = a+b+c;
        System.out.println(result);
        return result;
    }
    public static int addition (int a, int b, int c,int d){
        int result = a+b+c+d;
        System.out.println(result);
        return result;
    }
    public static double addition (double a, double b){
        double result = a+b;
        System.out.println(result);
        return result;
    }
    public static double addition (double a, double b,double c){
        double result = a+b+c;
        System.out.println(result);
        return result;
    }





}
