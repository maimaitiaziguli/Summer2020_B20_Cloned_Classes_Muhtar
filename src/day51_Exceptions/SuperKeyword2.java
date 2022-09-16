package day51_Exceptions;

class B{

    public B(){
        System.out.println("Super class' default constructor");
    }
}


public class SuperKeyword2 extends B{

    public SuperKeyword2(){
      // super();  // call the super class' constructor, but superclass'
        // constructor is default constructor so it is implicitly called
        System.out.println("Sub class' default constructor");
    }

    public static void main(String[] args) {
        new SuperKeyword2();

    }


}
