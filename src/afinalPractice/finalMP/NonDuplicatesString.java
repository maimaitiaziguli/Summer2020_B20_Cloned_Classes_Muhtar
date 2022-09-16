package afinalPractice.finalMP;

public class NonDuplicatesString {
    public static void main(String[] args) {

        String str = "aabbccde";
String uniques = "";
        for (int i = 0; i <str.length() ; i++) {
           char ch =  str.charAt(i);
           if (uniques.contains(""+ch)){
               continue;
           }else {
               uniques+=ch;
           }

        }
        System.out.println(uniques);









    }
}
