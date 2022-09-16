package afinalPractice.Arrays;

public class LongestString {
    // write a program that returns the longest string from an array of string
    public static void main(String[] args) {

       String [] arr = { "arzigul", "keiser","memetjan","ezmet"} ;

        int maxLength = arr[0].length();


       for (int i = 0; i <= arr.length-1; i++ ){

           if (maxLength < arr[i].length()){
               maxLength = arr[i].length();
           }
       }
        System.out.println(maxLength);

       for (String each : arr){
           if (each.length() == maxLength){
               System.out.println(each);
           }
       }





    }
}
