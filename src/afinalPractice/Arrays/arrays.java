package afinalPractice.Arrays;
import afinalPractice.accessModifiers.AccessModifiers;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arrays {

    public static void main(String[] args) {

        // there are two ways of declaring an array:
        //1)

        String[] names = {"alim", "Ezmet"};

        System.out.println(Arrays.asList(names));

        System.out.println("========================================");

        //2) this is only used for initialization the size of the array
        String[] names1 = new String[3];
        names1[0] = "Erkin";
        names1[2] = "Adil";


        // System.out.println(names.toString());

        for (int i = 0; i <= names.length - 1; i++) {
            String str = names[i];
            System.out.println(str);
        }

        System.out.println("=========================================");
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(names));
        System.out.println(list);
        System.out.println("=========================================");

        list.addAll(Arrays.asList(names1));
        System.out.println(list);
        System.out.println("=========================================");


        System.out.println(AccessModifiers.publicVariable);
        AccessModifiers.publicMethod();




    }
}
