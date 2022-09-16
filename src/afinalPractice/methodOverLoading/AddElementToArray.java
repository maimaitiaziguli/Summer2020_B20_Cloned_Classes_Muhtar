package afinalPractice.methodOverLoading;

import java.util.Arrays;

public class AddElementToArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int num = 10;
        int[] arr2 = new int[arr.length+1];
        arr2[arr2.length-1] = num;

        int i = 0;
        for ( int each : arr){
            arr2[i] = arr[i];
            i++;
        }
        System.out.println(Arrays.toString(arr2));



    }
}
