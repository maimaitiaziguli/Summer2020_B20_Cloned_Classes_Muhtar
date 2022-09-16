package day56_Abstraction.my_Practice;

public abstract class CarM extends Test {

    public String brand;
    public String model;
    public String bodyType;
    public String color;
    public double price;
    public String fuel;
    public int year;

    public CarM(String brand, String model, String bodyType, String color, double price, String fuel,int year) {
        this.brand = brand;
        this.model = model;
        this.bodyType = bodyType;
        this.color = color;
        this.price = price;
        this.fuel = fuel;
        this.year = year;
    }

    public abstract void start();
    public abstract void stop();

    @Override
    public String toString() {
        return "CarM{" +
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
