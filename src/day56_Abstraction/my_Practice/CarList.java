package day56_Abstraction.my_Practice;

public class CarList {
    public static void main(String[] args) {

       Tesla tesla1 = new Tesla("modle 3","sedan","blue",39500,
               "electric",true,true,true,2021,
               true);
        System.out.println(tesla1);
        tesla1.start();
        tesla1.autoDrive();
        tesla1.useCleanEnergy();
        tesla1.charge();
        tesla1.stop();

        System.out.println("=============================================================");

        Honda honda1 = new Honda("accord","sedan","red",25000,"gasoline",2022);
        System.out.println(honda1);
        honda1.start();
        honda1.stop();
        honda1.test();
        honda1.firstTest();








    }
}
