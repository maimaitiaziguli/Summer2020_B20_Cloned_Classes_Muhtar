package day56_Abstraction.AnimalTask;

public class AnimalObjects {
    public static void main(String[] args) {
        Duck duck1 = new Duck();
       boolean b =  duck1.isFriendly;
        System.out.println(b);
        duck1.swim();
        System.out.println(duck1.isFriendly);
    }
}
