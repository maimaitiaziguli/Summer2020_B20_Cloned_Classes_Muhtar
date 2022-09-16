package afinalPractice.loop;

import java.util.Scanner;

public class FrequencyOfChars3 {
     /*
        Write a program that user enters a string then Finds the frequency of each character in a string.
         */
     public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);
         System.out.println("Enter a string: ");
         String str = scan.next();
         String nonDup = "";

         for (int i = 0; i<= str.length()-1; i++){
             String ch = ""+str.charAt(i);
             if (!nonDup.contains(ch)){
                nonDup+=ch;
             }
         }
         System.out.println(nonDup);

         String expectedResult = "";
         String unique = "";
         int u  = 0;
         for (int i = 0; i<= nonDup.length()-1; i++){
             char ch = nonDup.charAt(i);
             int count = 0;

             for (int j = 0; j <= str.length()-1; j++){
                 if (str.charAt(j)==ch){
                     count++;

                 }
             }
             expectedResult += ""+ch+count;

         }
         System.out.println(expectedResult);
         System.out.println(unique);

         // find the the unique char in this String








     }
}
