package day56_Abstraction.PhoneTask;

public class PhoneObjects {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 11 pro",799,"Large");
        Samsung samsung = new Samsung("Galaxy 22",699,"Mediam");

        iphone.faceTiming(2028374221);
        iphone.calling(201221212,908212321);
        iphone.texting(408332123);

        samsung.calling(121221111);
        samsung.freezing();

        System.out.println("==========================");
        System.out.println(iphone);
        System.out.println(samsung);



    }
}
