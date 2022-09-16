package afinalPractice.staticKeyword;

public class StaticVariable {
    int a;
    static int b;
}

class Test{
    public static void main(String[] args) {

       StaticVariable variable1 = new StaticVariable();
        StaticVariable variable2 = new StaticVariable();

        variable1.a = 10;

        System.out.println(variable1.a);
        System.out.println(variable2.a);

        System.out.println("====================================");
        variable2.b = 20;

        System.out.println(variable1.b);
        System.out.println(variable2.b);



    }
}

class Test1 {
    public static void methodCall(){
        StaticVariable obj = new StaticVariable();
        System.out.println(obj.a);
    }


}