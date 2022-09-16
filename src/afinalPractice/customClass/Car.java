package afinalPractice.customClass;

public class Car {
    String brand = "";
    String model = "";
    Integer year = 0;

    public void setBrand(String brand,String model,Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public void getInfo (){
        System.out.println("Brand: " + brand + '\n'+" Model: "+ model +'\n'+ " Year: " + year);
return;
    }

    public void drive(){
        System.out.println(brand+" is moving forward the Golden Gate bridge");
    }
    public void maintenance (){
        System.out.println("Mechanics are maintenancing "+brand +" "+ model);
    }

}
