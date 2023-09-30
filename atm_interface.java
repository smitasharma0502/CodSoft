import java.util.Scanner;

class Account{
    private double balance;

    public Account(double initialbalance){
        balance = initialbalance;
    }
    public double showBalance(){
        return balance;
    }
    public void deposit(double amount) {
        if(amount > 0){
            balance += amount;
            System.out.println("Deposit of "+ amount+ "succesful.");
        }else{
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdrawAmount(double amount) {
        if(amount>0 && amount<= balance){
            balance-= amount;
            System.out.println("Withdrawal of "+ amount+ " successful. ");
        }else{
            System.out.println("Invalid withdrawal or insufficient balance.");
        }
    }
}
public class atm_interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double initialbalance= 100.0;
        Account account= new Account(initialbalance);

        System.out.println("!!!!WELCOME TO ATM!!!!");

        while (true) {
            System.out.println("\nChoose an option: ");
            System.out.println("1. Check Balance ");
            System.out.println("2. Amount Deposit ");
            System.out.println("3. Amount Withdrawal ");
            System.out.println("4. Exit ");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Your current balance is: Rs."+ account.showBalance());
                    break;
                case 2:
                    System.out.println("Enter amount to be deposited: Rs.");
                    double amountdeposit= scanner.nextDouble();
                    account.deposit(amountdeposit);
                    break;
                case 3:
                    System.out.println("Enter amount to be withdrawal: Rs.");
                    double amountwithdrawal= scanner.nextDouble();
                    account.withdrawAmount(amountwithdrawal);
                    break;
                case 4:
                    System.out.println("Thankyounfor using ATM");
                    System.out.println("Do visit again.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
