package day62_Maps.StringBuilder_StringBuffer;

public class StrB {
    public static void main(String[] args) {

       String str = "Cybertek ";
       str.concat(" School");
        System.out.println(str);  // it only prints "Cybertek" , because String is immutable(can not changed after initialisation)

        System.out.println("==================================================");
        StringBuilder strb = new StringBuilder("Cybertek");
        strb.append("School");   // mutable
        System.out.println(strb);


        System.out.println("====================================");

        StringBuilder strb2 = new StringBuilder();
        strb2.append("Kayak") ; // or =>  StringBuilder strb2 = new StringBuilder("Kayak");

        if (strb2.equals(strb2.reverse())){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }


        /*
        task:
        Write a program that can reverse any string
         */
        String s = "hello";
        StringBuilder strb3 = new StringBuilder();
        strb3.append(s).reverse();
        System.out.println(strb3);




    }
}
