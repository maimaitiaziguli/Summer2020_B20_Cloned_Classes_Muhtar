package afinalPractice.staticKeyword;

public class StaticBlock {
   static String schoolName;
   static int schoolId;
    static {
          schoolId = 100;
        schoolName ="Cybertek";
        System.out.println(schoolName);
        System.out.println(schoolId);
    }
    public static void main(String[]arg){
        System.out.println();
    }

}
