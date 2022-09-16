package afinalPractice.customClass;

public class Dog {
    String breed;
    String color;
    String size;
    int age;
    public void setInfo(String dogBreed, String dogColor, String dogSize, int dogAge){
        this.breed = dogBreed;
       dogColor = this.color;
       dogSize = this.size;
       dogAge = this.age;
    }
    public void getInfo (){
        System.out.println("Breed: "+breed+'\n'+"Color: "+color+'\n' +"Age: "+age+'\n'+"Size: "+size);

    }
    public void sleep(){
        System.out.println(breed+" is sleeping on the bed");

    }






}

