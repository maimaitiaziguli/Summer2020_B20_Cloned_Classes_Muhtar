package afinalPractice.loop;

import java.util.Scanner;

public class UserNameAndPassword {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //String userName = " Memetjan";
       // String password = "1983Am";


           System.out.println("Enter your user name: ");
           String uN = input.nextLine();
           System.out.println("Enter your password: ");
           String pW = input.nextLine();

           int count = 1;

           while (!(uN.equalsIgnoreCase("Memetjan") && pW.equals("1983Am"))){

               if (count > 2){
                   System.out.println("Your account is locked");
                   System.exit(0);
               }
               System.out.println("Invalid user name or password, Please re-enter");
               System.out.println("Enter your user name: ");
               uN = input.nextLine();
               System.out.println("Enter your password: ");
               pW = input.nextLine();

               count++;

           }


        System.out.println("You are logged in");



    }
}
