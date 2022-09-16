package afinalPractice.loop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your user name: ");
        String userName = input.nextLine();
        System.out.println("Enter your password: ");
        String password = input.nextLine();

        int attempts = 1;
        while (!(userName.equalsIgnoreCase("Memetjan") && password.equals("My1984"))){

            if (attempts > 2){
                System.out.println("Invalid user name or password");
                System.exit(0);
            }
            System.out.println("Your user name or password is not valid, please re-enter");
            System.out.println("Enter your user name: ");
            userName = input.nextLine();
            System.out.println("Enter your password: ");
            password = input.nextLine();

            attempts++;
        }

        System.out.println("logged in");








    }
}
