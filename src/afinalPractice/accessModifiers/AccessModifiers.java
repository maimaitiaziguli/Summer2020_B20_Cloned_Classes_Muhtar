package afinalPractice.accessModifiers;

public class AccessModifiers {
    public static int publicVariable = 100;
    public static void publicMethod(){
        System.out.println("This public method is called from other class inside the package ==>Public method");
    }

    static int defaultVariable = 200;
    static void defaultMethod (){
        System.out.println("Default method");
    }
}
