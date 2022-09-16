package Office_Hours.Practice_07_14_2020;

public class Notes {
    public static void main(String[] args) {

        System.out.println("hi");
        String str = "cat cat   catcatcat";
        int count = 0;
        while (str.contains("cat")){
            count++;
            str = str.replaceFirst("cat", "");
        }
        System.out.println(count);
        System.out.println(str);

/*
        String str = "catcat cat";
        int count = 0;  // counts the frequency
        while (str.contains("cat")) {
            count++;
            str.replaceFirst("cat", "");
        }
        System.out.println(count);

 */


    }
}
