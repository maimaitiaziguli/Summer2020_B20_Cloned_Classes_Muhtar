package afinalPractice.methodOverLoading;

import java.util.Locale;
import java.util.Scanner;

public class MyCustomMethods {

    public static String nameFormat(String firstName, String lastName){

        String nameFormat = firstName.toUpperCase()+lastName.toUpperCase();
        System.out.println(nameFormat);
       return nameFormat;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter the operator: ");
        char operator = input.next().charAt(0);
        System.out.println("Enter the second number: ");
        int secondNumber = input.nextInt();
       double result = calculator(firstNumber,operator,secondNumber);
        System.out.println("The result is: " + result );
    }

    public static double calculator (int firstNumber, char operator, int secondNumber) {
        double result = (operator == '=') ? firstNumber + secondNumber : (operator == '-') ? firstNumber - secondNumber : (operator == '/') ? firstNumber / secondNumber
                : (operator == '*') ? firstNumber * secondNumber : operator == '%' ? firstNumber % secondNumber : 0;

        System.out.println("The result is: " + result );

        return result;
    }





    }

