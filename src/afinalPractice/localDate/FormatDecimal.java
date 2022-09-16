package afinalPractice.localDate;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.Format;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatDecimal {
    public static void main(String[] args) {

        DecimalFormat m = new DecimalFormat("0.0000");
        double d = 20/6.0;
        System.out.println(d);
        System.out.println(m.format(d));

        DateTimeFormatter dytf = DateTimeFormatter.ofPattern("dd,mm,yy");
        LocalDate dob = LocalDate.of(2013,5,7);
        System.out.println(dob);




    }
}
