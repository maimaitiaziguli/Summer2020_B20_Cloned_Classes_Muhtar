package afinalPractice.finalMP;

public class UniqueCharacter {
    public static void main(String[] args) {

        String str = "aabbccde";

        String uniques = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length() ; j++) {
                char ch2 = str.charAt(j);
                if (ch==ch2){
                    count++;
                }
            }

            if (count == 1){
                uniques += ch;
            }
        }

        System.out.println(uniques);











    }






}
