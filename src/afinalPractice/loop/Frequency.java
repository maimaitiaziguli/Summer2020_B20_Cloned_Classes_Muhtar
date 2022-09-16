package afinalPractice.loop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1 = input.next();
        System.out.println("Enter a single character string");
        String str2 = input.next();

        int count = 0;
        for (int i = 0; i <= str1.length()-1; i++){
               if (str2.equalsIgnoreCase(str1.substring(i,i+1)))
                count++;
            }
        System.out.println("Frequency of "+ str2 + " in "+ str1 + " is: " + count);

    }






    }

