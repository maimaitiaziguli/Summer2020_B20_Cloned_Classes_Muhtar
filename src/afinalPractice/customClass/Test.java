package afinalPractice.customClass;

public class Test {
    public static void main(String[] args) {

        Car toyota = new Car();
        toyota.setBrand("Toyota","Camry",2020);
         toyota.getInfo();
         toyota.drive();
         toyota.maintenance();

         Dog dog = new Dog();
         dog.setInfo("DingQulaq", "black","large",8);
         dog.getInfo();
         dog.sleep();
    }
}
