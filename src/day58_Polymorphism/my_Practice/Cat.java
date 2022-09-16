package day58_Polymorphism.my_Practice;

public class Cat extends Animal{

    public String catName;
    public Cat(String catName,int age, char gender) {
        super(age, gender);
        this.catName = catName;
    }

    public void scratch(){
        System.out.println("Cat "+catName+" is scratching");
    }


    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", gender=" + gender +
                ", catName='" + catName + '\'' +
                '}';
    }
}
