package afinalPractice.finalMP;


import java.util.Arrays;
import java.util.Scanner;

public class FindingMaxMinArray {
    public static void main (String[] args){



        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers you want to enter? ");
         int n = input.nextInt();
         int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("enter your number");
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]){
                max = arr[i];
            }
            if (min > arr[i]){
                min=arr[i];
            }

        }

        System.out.println("Max: "+max);
        System.out.println("Min: "+min);












    }
}
