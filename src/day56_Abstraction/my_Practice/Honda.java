package day56_Abstraction.my_Practice;

public class Honda extends CarM{


    public Honda( String model, String bodyType, String color, double price, String fuel,int year) {
        super("honda", model, bodyType, color, price, fuel,year);
    }

    @Override
    public void start() {
        System.out.println(brand +" " + model +" is staring");
    }

    @Override
    public void stop() {
        System.out.println(brand + " " + model +" is stopping");
    }


    @Override
    public String toString() {
        return "Honda{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", color='" + color + '\'' +
                ", price= $" + price +
                ", fuel='" + fuel + '\'' +
                ", year=" + year +
                '}';
    }
}
