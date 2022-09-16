package afinalPractice.Encapsulation;
/*
WarmUp tasks:
	create custom class called BankAccount for Bank of America
			public variables:  bankName, firstName, lastName
	 		private variables: accountHolder, accountNumber, balance

	 		encapsulate all the private data
	 				(DO NOT USE SHORTCUT)

	 		create a constructor that can initialize firstName and lastName
	 				(DO NOT USE SHORTCUT)

	 		action:
	 				deposit
	 				withdraw
	 				availableBalance
 */

public class BankAccount {


    String firstName;
    String lastName;
    public static String bankName;

    public BankAccount (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    static {
        bankName = "Bank of America";
    }



    private String accountHolder;
    private long accountNumber;
    private double balance;

   public String getAccountHolder(){
        return accountHolder;
   }

    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }


    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(long balance){
        this.balance = balance;
    }


    public void deposit(double amount) {
        System.out.println("Depositing "+ amount);
        balance+=amount;
    }

    public void withdraw (double amount){
       if (amount < 0 || amount > 800){
           System.out.println("Invalid amount, your withdrawing amount is not in the range of 1 ~800 ");
           return;
       }
       if (amount > balance){
           System.out.println("Not enough balance, adjust the amount.");
           return;
       }

        System.out.println("Withdrawing "+ amount);
       balance-=amount;

    }

    public void availableBalance(){
        System.out.println("Your available balance is: "+getBalance());
    }


    public String toString() {
        return bankName +

                "\n firstName: " + firstName +
                "\n lastName: " + lastName +
                "\n accountHolder: " + getAccountHolder() +
                "\n accountNumber: " + getAccountNumber() +
                "\n balance: " + getBalance();

    }
}
