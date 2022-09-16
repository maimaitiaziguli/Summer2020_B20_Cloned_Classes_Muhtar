package afinalPractice.loop;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 0;
        int min = 2147483647;
        for (int i = 0; i < 5; i++){
            System.out.println("Enter a number: ");
            int num = input.nextInt();
            if (num > max){
                max =num;
            }
            if (num < min){
                min = num;
            }

        }
        System.out.println("Max number is "+ max+'\n'+"Min number is: "+ min);




    }
}
