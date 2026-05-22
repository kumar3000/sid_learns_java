import java.util.Scanner;

public class Main {
    // DECLARE VARIABLES
    // DISPLAY MENU
    // GET AND PROCESS USERS CHOICE
    // static void showBalance() displays balance
    // static void deposit(double amount) make a deposit
    // static void withdraw(double amount) withdraw funds
    // EXIT MESSAGE
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double amount;
        int option;
        double balance = 0.00;
        boolean isRunning = true;

        System.out.println("***************\nBANKING PROGRAM\n***************");
        while (isRunning) {
            System.out.println("1. Show Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            System.out.print("***************\nEnter your choice (1-4): ");
            option = sc.nextInt();
            if (option == 4) {
                break;
            }

            switch (option) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw();
                default -> {
                    System.out.println("Invalid Input, exiting...");
                    isRunning = false;
                }
            }
        }

        sc.close();
    }

    static void showBalance(double balance) {
        System.out.printf("Balance: $%.2f\n", balance);
    }

    static double deposit() {
        System.out.print("Amount to desposit: ");
        double amount = sc.nextDouble();

        if (amount < 0) {
            System.out.println("Can't desposit negative money.");
            return 0;
        } else {
            return amount;
        }
    }

    static double withdraw() {
        System.out.print("Amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount < 0) {
            System.out.println("Can't withdraw negative money.");
            return 0;
        } else {
            return amount;
        }
    }
}
