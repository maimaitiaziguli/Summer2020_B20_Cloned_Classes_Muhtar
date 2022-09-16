package afinalPractice.Arrays;

import java.util.Arrays;

public class Numbers {
    public static void main(String[] args) {

      int [] number = new int[100];

      for (int i = 1; i <= number.length-1; i++){
          number[i] = i+1;
      }
        System.out.println(Arrays.toString(number));



for (int each :number){
    if (each %2 != 0){
        continue;
    }else {
        System.out.print("Even Numbers: " + each+" ");
    }
}



    }
}
