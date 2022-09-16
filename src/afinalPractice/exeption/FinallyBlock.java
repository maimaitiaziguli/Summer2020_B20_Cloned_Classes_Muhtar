package afinalPractice.exeption;

public class FinallyBlock {
    public static void main(String[] args) {

        try {
            System.out.println(8 / 0); // Arithmetic exception
            System.out.println("Try Block");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Catch Block");

        }finally {
            System.out.println("Finally block");
        }
        System.out.println("Completed");

    }
}
