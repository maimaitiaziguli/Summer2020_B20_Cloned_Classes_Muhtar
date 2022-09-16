package afinalPractice.Arrays;

public class AverageNumber {
    //Write a program that can find the average number from an array of integers.
    public static void main(String[] args) {

     int[] num = {1,4,5};
     int sum = 0;
     for (int i = 0; i <= num.length-1; i++){
        sum += num[i];
     }
        System.out.println("Sum: " + sum);
        System.out.println("Length of the array: " + num.length);
     double averageNum = sum/(double)num.length;
        System.out.println("Average number: " + averageNum);




    }
}
