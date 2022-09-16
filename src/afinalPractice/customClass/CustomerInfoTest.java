package afinalPractice.customClass;

import java.time.LocalDate;
import java.util.Arrays;

public class CustomerInfoTest {
    public static void main(String[] args) {

        CustomerInfo customer1 = new CustomerInfo();
        CustomerInfo customer2 = new CustomerInfo();
        CustomerInfo customer3 = new CustomerInfo();
        CustomerInfo customer4 = new CustomerInfo();
        CustomerInfo customer5 = new CustomerInfo();

        customer1.setInfo("Alim",'M', LocalDate.of(1990,6,12),123456);
        customer2.setInfo("Nijan",'M',LocalDate.of(1982,04,13),321123);
        customer3.setInfo("Nisahan",'F',LocalDate.of(1998,7,25),123412);
        customer4.setInfo("Bahar",'F',LocalDate.of(1996,2,12),1112233);
        customer5.setInfo("Guzal",'F',LocalDate.of(2005,7,12),998877);

        CustomerInfo [] customerList = new CustomerInfo[5];
        customerList[0] = customer1;
        customerList[1] = customer2;
        customerList[2] = customer3;
        customerList[3] = customer4;
        customerList[4] = customer5;

        customer1.getInfo();
        System.out.println("=====================================");

        for (CustomerInfo each :customerList){
            if (each.name == "Bahar"){
                continue;

            }
            each.getInfo();
        }







    }
}
