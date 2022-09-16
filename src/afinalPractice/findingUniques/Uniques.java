package afinalPractice.findingUniques;

import java.util.Arrays;

public class Uniques {
    /*
    Write a Program that can find the unique characters  from a string
     */
    public static void main(String[] args) {

     String str = "aabbccjjssddaallopen";
     String uniques = "";

for (int i = 0; i <= str.length()-1;i++){
    char ch = str.charAt(i);
    int firstIndex = str.indexOf(ch);
    int lastIndex =  str.lastIndexOf(ch);
    if (firstIndex==lastIndex){
        uniques+=ch;
    }
}
        System.out.println(uniques);


// find the unique numbers
        // in order to find the uniques
        // first, retrieve each number in the array
        // second, compare the first index and last index
        // third, if the first index and the last index of each number are equal that is unique number


int [] num = {1,2,3,4,5,4,3,2,1,11,10,30,5,6,9,77,9,8};
          Arrays.sort(num);
/*   Solution 1:
String numStr = Arrays.toString(num);
String uniquenumbers = "";

        System.out.println(numStr);

for (int i = 0; i <= numStr.length()-1; i++){

    char ch = numStr.charAt(i);
    int firstIndex = numStr.indexOf(ch);
    int lastIndex = numStr.lastIndexOf(ch);

    if (firstIndex == lastIndex){
        uniquenumbers +=","+ ch;
    }

}

        System.out.println(uniquenumbers);
 */

        // Solution 2:
        for (int i = 0; i <= num.length-1; i++){
            int num1 = num[i];
            int count = 0;


            for (int j = 0; j <= num.length-1; j++){
                int num2 = num[j];
                if (num1 == num2){
                    count++;
                }
            }
            if (count ==1 ){
                System.out.print(num1+" ");
            }


        }




    }
}
