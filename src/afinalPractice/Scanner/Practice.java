package afinalPractice.Scanner;


import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner userInPut = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = userInPut.nextLine();

        System.out.println("Enter your Id: ");
        int ID = userInPut.nextInt();


        System.out.println("Enter your gender: ");
        String gender = userInPut.next();

        System.out.println( fullName + '\n' + ID + '\n'+ gender);





    }
}
