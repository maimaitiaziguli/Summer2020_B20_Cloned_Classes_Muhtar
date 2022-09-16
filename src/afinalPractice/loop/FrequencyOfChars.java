package afinalPractice.loop;

import java.util.Scanner;

public class FrequencyOfChars {
    public static void main(String[] args) {
        /*
        Write a program that user enters a string then Find the frequency of each character in a string.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");

        String str = input.next();

        String nonDup = "";

        // first of all , lets find the non duplicates of the given string

        for (int i = 0; i <= str.length()-1; i++){
            String ch = "" + str.charAt(i);
            if (nonDup.contains(ch)){
                continue;
            }else{
                nonDup+= ch;
            }
        }
        System.out.println(nonDup);


        String expectedResult = "";

        for (int j = 0; j <= nonDup.length()-1; j++){
            char ch = nonDup.charAt(j);
            int count = 0;

            for (int i = 0; i <= str.length()-1; i++){
                if (str.charAt(i)==ch){
                    count++;
                }
            }
            expectedResult += ""+ ch + count;
        }

        System.out.println(expectedResult);


    }
}
