package day58_Polymorphism.my_Practice;

public class Dog extends Animal{

    public String dogName;

    public Dog(String dogName,int age, char gender) {
        super(age, gender);
        this.dogName = dogName;
    }



}
