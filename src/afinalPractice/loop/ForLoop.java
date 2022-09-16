package afinalPractice.loop;

public class ForLoop {
    public static void main(String[] args) {

       for (char ch = 'A'; ch <= 'Z'; ch++){
           System.out.print(ch);
       }

        System.out.println();
        System.out.println("==============================");
        for (char ch = 65; ch <= 90; ch++){
            System.out.print(ch);
        }

        System.out.println();

        for (int i = 90; i >= 65; i--){
            char ch = (char)i;
            System.out.print(ch);
        }





    }
}
