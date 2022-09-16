package day62_Maps.myPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class EntrySetForMap {
    public static void main(String[] args) {

        Map<String, String> testCredentials = new LinkedHashMap<>();
        testCredentials.put("username1", "password1");
        testCredentials.put("username2", "password2");
        testCredentials.put("username3", "password3");
        testCredentials.put("username4", "password4");
        testCredentials.put("username5", "password5");

        System.out.println("Username and password not entered " + testCredentials.entrySet());

        System.out.println("==================================");

        for (Map.Entry<String,String> each :testCredentials.entrySet()){
            System.out.println("User name and password entered: " + each);
            // or
            String userName = each.getKey();
            String password = each.getValue();
            System.out.println("Credentials entered: " + userName + " - " + password);
            System.out.println("================================================");
        }










    }
}
