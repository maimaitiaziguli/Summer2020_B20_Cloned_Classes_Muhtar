package afinalPractice.Encapsulation;

public class BankOfAmerica {
    public static void main(String[] args) {

        BankAccount customer1 = new BankAccount("Ezmet","Peyzulla");
        customer1.setAccountHolder(customer1.firstName+" "+customer1.lastName);
        customer1.setAccountNumber(123456789);
        customer1.setBalance(1000);

        customer1.availableBalance();
        customer1.deposit(1000);
        customer1.availableBalance();

        customer1.withdraw(100);
        customer1.withdraw(200);
        customer1.withdraw(0);
        customer1.withdraw(-100);
        customer1.availableBalance();

        customer1.deposit(150000);

        System.out.println("===============================");
        System.out.println(customer1);





    }
}
