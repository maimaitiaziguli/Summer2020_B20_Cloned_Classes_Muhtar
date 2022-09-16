package afinalPractice.customClass;

import java.time.LocalDate;

public class CustomerInfo {

    String name;
    char gender;
    LocalDate DOB;
    int ID;

    public void setInfo (String name, char gender, LocalDate DOB, int ID){

        // if the instance variable and the local variable have the same name
        // we should use this keyword to call the instance variables
        this.name = name;
        this.gender = gender;
        this.DOB = DOB;
        this.ID = ID;
        //==> if the instance variable and local variable have different name like blow we
        //  don't need to use this keyword
         //   name = customerName;
       //     gender = gen;
        //    DOB = DOb;
       //     ID = Id;
    }

    public void getInfo(){
        System.out.println("The basic information of " + name +'\n'+"Name: "+name+'\n'+"Gender: "+gender+'\n'+
                "Date of birth: "+DOB+'\n'+"ID: "+ID);

    }

    public void position(){
        //String position = "manager";
        System.out.println(name+" is working as a manager.");
    }




}
