package day60_Collection;

import java.util.*;

public class SetPractice {
// write aprogram that can remove duplicates from string

    public static void main(String[] args) {
        System.out.println("====== converting a string to an Array of string ====");
        String str = "zhdxbbaacczh"; // zhdxbac

        String[] arr = str.split("");

        System.out.println(Arrays.toString(arr)  ); //

        //
        System.out.println("===============end================");


        System.out.println("======= removing the duplicates ======");
        Set<String> lhs = new LinkedHashSet<>();
        lhs.addAll( Arrays.asList(arr) );
        System.out.println(lhs);
        System.out.println(Arrays.toString(arr));
        System.out.println("============end===========");

/*
        String str2 = "ttttyyyyyuuuuuuuiiiiiiaaaaaaaaa";

        str2 = new LinkedHashSet<>( Arrays.asList(str2.split(""))).toString() ;

        System.out.println(str2);

        str2 = str2.replace("[", "").replace(", ", "").replace("]","");

        System.out.println(str2);

 */

        System.out.println("======================HashSet==========================");
        //String a1 = "abcabc";   // a b c
       // String a2 = "cabbbc";   // a b c

        HashSet<String> hs = new HashSet<>();
        hs.addAll(  Arrays.asList( str.split("")  ) );
        System.out.println(hs);
        System.out.println("====== end ======");

        /*
        HashSet<String> b2 = new HashSet<>();
        b2.addAll( Arrays.asList( a2.split("")) );
        System.out.println(b2);

        a1 = hs.toString();
        a2 = b2.toString();

        System.out.println( a1.equals(a2));

        System.out.println("========================================================");
        String x1 = "cacacabb";
        String x2 = "bbcaaaaa";

          x1 =   new TreeSet<>(Arrays.asList( x1.split(""))).toString(); // a b c
          x2 =   new TreeSet<>(Arrays.asList( x2.split(""))).toString(); // a b c

        System.out.println(x1.equals(x2));

        System.out.println("===========================================================");

        String[] names = {"Aalia", "Mustafa", "Elkem", "Aalia", "Aalia", "Virginia"};

        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.addAll( Arrays.asList( names ) );

        names = set1.toArray(new String[0]);  // converting collection type to array

        System.out.println(  Arrays.toString(names) );

        System.out.println("===============================================================");

        String[] names2 = {"Roman", "Abzal", "Nurbiye", "Roman", "Roman", "Roman", "Roman", "Roman"};

        names2 = new LinkedHashSet<>( Arrays.asList(names2) ).toArray( new String[0] );

        System.out.println( Arrays.toString(names2) );

        System.out.println("====================================================================");
        Integer[] numbers = {1,1,1,2,2,2,2,0,0,0,0,0,1,1,1,2,3,4,5,6,7,8,9};

        numbers =  new TreeSet<>( Arrays.asList(numbers) ).toArray(new Integer[0]);

        System.out.println( Arrays.toString(numbers));

         */

        System.out.println("===================TreeSet ======================");
        Set<String> ts = new TreeSet<>();
        ts.addAll(Arrays.asList(str.split("")));
        System.out.println(ts);
        System.out.println("============= end ===============");

        System.out.println("================== convert to string =============");
        String tsStr = ts.toString();
        String lhsStr = lhs.toString();
        String hsStr = hs.toString();

        String tsStr1 = tsStr.replace("[","").replace(",","").replace("]","");
        System.out.println(tsStr1);

        String lhsStr1 = lhsStr.replace("[","").replace(",","").replace("]","");
        System.out.println(lhsStr1);

         String hsStr1 = hsStr.replace("[","").replace(",","").replace("]","");
        System.out.println(hsStr1);






        //System.out.println("String "+st.replace("[","").replace(",","").replace("]",""));



    }

}
