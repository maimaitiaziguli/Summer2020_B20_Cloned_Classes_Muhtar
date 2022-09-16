package afinalPractice.toString;

public class toStringMethod {
    String name;
    char gender;
    int age;
    double salary;
    public void setInfo(String name, char gender, int age, double salary){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }

    public void fixBug (){
        System.out.println(name + " is fixing the bug");
    }

   public String toString(){
        return "Name: "+name +" Gender: "+gender+" Age: "+ age+ " Salary: "+salary;
   }

}
