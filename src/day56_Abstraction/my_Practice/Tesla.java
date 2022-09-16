package day56_Abstraction.my_Practice;

public class Tesla extends CarM implements Chargeable,CleanEnergy,AutoDrive{

    public boolean isMadeInUs ;


    public Tesla(String model, String bodyType, String color, double price, String fuel,boolean isChargeable, boolean isCleanEnergy,
    boolean hasAutoPilot,int year,boolean isMadeInUs) {
        super("Tesla", model, bodyType, color, price, fuel,year);
        this.isMadeInUs = isMadeInUs;
        hasAutoPilot = hasAutoPilot;
        isChargeable = isChargeable;
        isCleanEnergy = isCleanEnergy;
    }


    @Override
    public void start() {
        System.out.println(brand + " " + model + " is starting");
    }

    @Override
    public void stop() {
        System.out.println(brand + " " + model + " is stopping");
    }

    @Override
    public void autoDrive() {
        System.out.println(brand + " " + model + " is set up for auto drive mode, enjoy your trip");
    }

    @Override
    public void charge() {
        System.out.println(brand + " " + model + " is being charged, will be completed in 15 minutes");
    }

    @Override
    public void useCleanEnergy() {
        System.out.println(brand + " " + model + " uses clean energy.");
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", color='" + color + '\'' +
                ", price= $" + price +
                ", fuel='" + fuel + '\'' +
                ", year=" + year +
                ", isMadeInUs=" + isMadeInUs +
                '}';
    }
}
