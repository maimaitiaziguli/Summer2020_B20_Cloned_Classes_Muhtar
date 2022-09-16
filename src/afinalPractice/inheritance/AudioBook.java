package afinalPractice.inheritance;

public class AudioBook extends Book{
    int length = 55;
    String narrator = "Abduqeyum";
    public void listen(){
        System.out.println("Now listening to the audio book "+title);
    }

    public static void main(String[] args) {
        System.out.println("Title : " );

    }
}
