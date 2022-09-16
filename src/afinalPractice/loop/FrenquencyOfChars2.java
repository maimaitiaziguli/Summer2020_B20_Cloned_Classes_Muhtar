package afinalPractice.loop;

public class FrenquencyOfChars2 {
    public static void main(String[] args) {


        // Write a program that can returns the frequency of every single characters from a string

        String str = "aabbc";
        String nonDupStr = "";
        // in order to find the frequency of each character we need to find the non duplicate characters

        for (int i = 0; i <= str.length()-1; i++){
            String ch = ""+str.charAt(i);
            if (!nonDupStr.contains(ch)){
                nonDupStr += ch;
            }
        }
        System.out.println(nonDupStr);


        System.out.println("=====================");


        String expectedResult = "";
        for (int j = 0; j <= nonDupStr.length()-1; j++){
            char ch = nonDupStr.charAt(j);
            int count = 0;

            for (int i = 0; i <= str.length()-1; i++){

                if (str.charAt(i)==ch){
                    count++;
                }
            }
            expectedResult += ""+ch + count;
        }

        System.out.println(expectedResult);









    }
}
