package afinalPractice.loop;

public class DivisionOfTwoNum {
    public static void main(String[] args) {
      /*
      Write a program that can divide two numbers without using / or % operators and returns
      the division and remainder.
      input: 10
              3
       output: 3 with a remainder of 1
       */
        int a = 5;
        int b = 3;

        int count = 0;

        while (b > 0 && b <= a){
            a -= b;
            count++;
        }
        System.out.println(count + " with the remainder of "+ a);





    }
}
