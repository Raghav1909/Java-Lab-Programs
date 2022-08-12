package ATM;

public class Bank {
    int accNo, minBal;
    String name;
    double balance;

    public Bank(int accNo, String name) {
        this.accNo = accNo;
        this.name = name;
        balance = 1000;
        minBal = 100;
        System.out.println("Bank account successfully created.");
    }

    public void deposit(double amt) {
        balance += amt;
        System.out.println("Amount deposited = " + amt);
        checkBalance();
    }

    public void withdraw(double amt) {
        if (balance - amt > minBal) {
            balance -= amt;
            System.out.println("Amount withdrawn = " + amt);
        } else
            System.out.println("Insufficient amount in account");

        checkBalance();
    }

    public void checkBalance() {
        System.out.println("Balance amount = " + balance);
    }

    public void displayCustomer() {
        System.out.println("Account details:");
        System.out.println("Account number: " + accNo);
        System.out.println("Name of account holder: " + name);
        System.out.println("Balance amount: " + balance);
    }
}
