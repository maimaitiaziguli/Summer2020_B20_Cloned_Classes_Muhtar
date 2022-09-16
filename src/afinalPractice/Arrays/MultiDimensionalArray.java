package afinalPractice.Arrays;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {

       int [][] arr2D = {{1,2,3,4},{5,6,7,8,9},{10,11,12,13,14,15}} ;
       for (int[] each : arr2D){
           System.out.println();
           for (int eachNum : each){
               System.out.print( eachNum+" ");
           }
       }


        System.out.println();
        System.out.println("=============================");
        for (int i = arr2D.length-1;i >= 0; i--){
            int [] each = arr2D[i];
            System.out.println();
            for (int eachNum : each){
                System.out.print(eachNum+" ");
            }
        }
    }
}
