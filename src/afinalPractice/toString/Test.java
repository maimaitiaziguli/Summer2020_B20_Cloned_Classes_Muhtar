package afinalPractice.toString;

public class Test {
    public static void main(String[] args) {

        toStringMethod m1 = new toStringMethod();
        m1.setInfo("Guzal",'M',17,1500);
        System.out.println(m1);
        m1.fixBug();
    }
}
