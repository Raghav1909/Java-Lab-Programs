import ATM.Bank;

public class Program8 {
    public static void main(String[] args) {
        Bank a = new Bank(100233, "ABC");
        a.getDeposit(1000);
        a.getWithdraw(2000);
        a.displayCustomer();
    }
}
