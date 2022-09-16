package afinalPractice.accessModifiers;

public class Test {
    public static void main(String[] args) {
        System.out.println("This public variable is called from other class inside the package ==> "+AccessModifiers.publicVariable);
        AccessModifiers.publicMethod();

        System.out.println(AccessModifiers.defaultVariable);
        AccessModifiers.defaultMethod();
    }
}
