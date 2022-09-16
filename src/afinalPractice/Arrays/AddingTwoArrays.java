package afinalPractice.Arrays;

import java.util.Arrays;

public class AddingTwoArrays {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        int [] arr2 = {6,7,8,9,10};
        int [] arr3 = new int[arr.length+arr2.length];

        int i = 0;
        for (int each : arr){
           arr3[i] = arr[i];
           i++;
        }


        for (int j = 0; j <= arr3.length-arr2.length-1; j++){
            arr3[arr3.length-arr2.length-1] = arr2[j];
        }




        System.out.println(Arrays.toString(arr3));

    }
}
