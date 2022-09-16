package day62_Maps.myPractice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class IteratingMap {
    public static void main(String[] args) {


        Map<String,LocalDate> map = new LinkedHashMap<>();

        map.put("John", LocalDate.of(1993,5,11));
        map.put("Nancy", LocalDate.of(1985,4,15));
        map.put("Petter", LocalDate.of(1993,1,13));
        map.put("Joseph", LocalDate.of(1997,4,29));
        map.put("Anna", LocalDate.of(1978,3,17));

        System.out.println(map.entrySet());
        System.out.println("============= get (value) ============");
        System.out.println(map.get(LocalDate.of(1985,4,15)));

        System.out.println("========1111===========");
        System.out.println(map.keySet());
        System.out.println("=======2222=======");
        System.out.println(map.values());

        System.out.println("====== we can get each key using loop ========");
        for (String each : map.keySet()){
            System.out.println(each);
        }

        System.out.println("=========== inorder to retrieve a specific object in the " +
                "\ncollection type we can convert the collection type in to a list then " +
                "\nwe can retrieve the object by using 'get() method. lets get the second " +
                "\nobject in the map ===============" );
        List<String>list = new ArrayList<>(map.keySet());
        System.out.println(list.get(1));

        System.out.println(" ====== value =========");
        List<LocalDate>list1 = new ArrayList<>(map.values());
        //or list1.addAll(map.values())
        System.out.println(list1.get(1));

        // or
        System.out.println(" ====== retireve every single value ======");
        for (LocalDate each : map.values())
            System.out.println(each);


        System.out.println("================ map =====================");
        System.out.println(map);

        System.out.println("========= get(Key) ==========");
        System.out.println(map.get("Nancy"));
        System.out.println("========= isEmpty ==========");
        System.out.println(map.isEmpty());
        System.out.println("======== contains key & value ==========");
        System.out.println(map.containsKey("nancy"));
        System.out.println("==========containsValue ============");
        System.out.println(map.containsValue(LocalDate.of(1985,4,15)));
        System.out.println("========= remove ==========");
        System.out.println(map.remove("Nancy"));
        System.out.println(map);
        System.out.println("=========== clear() ==============");
        map.clear();
        System.out.println(map);





    }
}
