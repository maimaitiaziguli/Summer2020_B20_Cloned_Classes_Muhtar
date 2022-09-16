package afinalPractice.constructor;

public class Cat {

    public Cat(String str){
        System.out.println("Hello " + str );
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Muxuk");
        Cat cat2 = new Cat("Aslan");
    }
}
