package afinalPractice.constructor;

import day46_ConstructorCalls.ConstructorCall2;

public class ConstructorCall {
    public ConstructorCall(int a){
        System.out.println("Constructor call:" + 1);
    }
    public ConstructorCall(int a, int b){
        this(1);
    }

    public ConstructorCall(double a, double b){
        this(2,4);
    }

    public static void main(String[] args) {
        ConstructorCall constructorCall = new ConstructorCall(2.3,3.3);
    }

}
