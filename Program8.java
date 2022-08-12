import java.util.Scanner;

import ATM.Bank;

public class Program8 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the name of account holder:");
        String name = ip.nextLine();
        System.out.println("Enter account number:");
        int accNo = ip.nextInt();
        Bank client = new Bank(accNo, name);
        while (true) {
            System.out.println("1.Deposit\n2.Withdraw\n3.Display\n4.Exit");
            int ch = ip.nextInt();
            double amt;
            switch (ch) {
                case 1:
                    System.out.println("Enter the amount to be deposited:");
                    amt = ip.nextDouble();
                    client.deposit(amt);
                    break;

                case 2:
                    System.out.println("Enter the amount to be withdrawn:");
                    amt = ip.nextDouble();
                    client.withdraw(amt);
                    break;

                case 3:
                    client.displayCustomer();
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.exit(0);
            }
        }
    }
}
