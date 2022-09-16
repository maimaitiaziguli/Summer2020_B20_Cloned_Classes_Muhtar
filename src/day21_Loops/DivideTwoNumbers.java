package day21_Loops;

/*
    4. write a program that can divide two numbers without using / & % operators and retuns the devision and remainder
            ex:
                input:  10
                        3

                0utput: 3 with a remainder of 1

               10/3 = 3

               10 - 3 = 7
               7 - 3 = 4;
               4 - 3 = 1;

               3/3

               3-3 = 0

 */

import java.util.Scanner;

public class DivideTwoNumbers {

    public static void main(String[] args) {
        int a = 5; //2
        int b = 3;

        if(b == 0){
            System.out.println("Invalid Input");
            System.exit(0); // forcefully terminating the program
        }


        int count = 0; //3

        while(a >= b){
            a -= b;
            count++;
        }

        System.out.println(count+" with a remainder of "+a);




        System.out.println("=============");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        int count2 = 0;
        if (num2 == 0 || num2 > num1 || num1 == 0){
            System.out.println("Invalid Entry");
            System.exit(0);
        }
        while(num1>= num2){
            num1 -= num2;
            count2++;
        }
        System.out.println(count2 +" with remainder of  " + num1);
    }







}
