package afinalPractice.Encapsulation;

public class Test {
    public static void main(String[] args) {
     Credentials obj1 = new Credentials("Alim",20);
     obj1.setUserName("Alim998");
     String a = obj1.getUserName();

     obj1.setPassword("123123Ak");
     String b = obj1.getPassword();
        System.out.println(a+"\n"+b );


    }
}
