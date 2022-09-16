package afinalPractice.Encapsulation;

import java.time.LocalDate;

public class Person {
    public static String company;
    public LocalDate DOB;
    public String birthPlace;

   private String name;
   private int age;
   private int ssn;


public Person(String birthPlace,LocalDate DOB){
this.birthPlace = birthPlace;
this.DOB = DOB;
}

static {
    company = "Keiser Inc";
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public static void main(String[] args) {
        Person p1 = new Person("East Turkistan",LocalDate.of(2010,02,10));

        p1.setName("Alim");
        p1.setAge(12);
        p1.setSsn(112212);


        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getSsn());
        System.out.println(company);
        System.out.println(p1.DOB);
        System.out.println(p1.birthPlace);


    }


}
