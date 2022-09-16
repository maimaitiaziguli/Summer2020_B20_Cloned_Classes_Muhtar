package afinalPractice.exeption;

import java.util.ArrayList;

public class A {
    public static void main(String[] args)  {

        ArrayList<Integer> list = new ArrayList<>();
       // System.out.println( list.get(1)); // ==> gives us an exception
       // System.out.println("Next step");  // now we can not print "next step" because
        // there is an exception in above code fragment.
        // so we should handle the exception using try & catch block

String exceptionMessage = "";

        try {

            System.out.println( list.get(1)); // ==> gives us an exception
        }catch (Exception e){

            exceptionMessage = e.getMessage();
        }

        System.out.println("Next step");
        System.out.println(exceptionMessage);


        System.out.println("===================================");


        String exceptionInfo = "";

        try {
            System.out.println("try block: "+10/0);
            System.out.println("try block");
        }catch (Exception e){
            exceptionInfo = e.getMessage();
            System.out.println("catch block: "+exceptionInfo);
        }finally {
            System.out.println("finally block");
        }

    }
}
