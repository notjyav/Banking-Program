import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] arg) {

        double balance = 0;

        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");

            System.out.print("Enter your choice (1-4) ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }

        }


        scanner.close();
    }


    static void showBalance(double balance) {
        System.out.println("***************");
        System.out.printf("$%.2f\n", balance);
    }
    static double deposit() {

        double amount;

        System.out.print("Enter Deposit: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount can not be negative");
            return 0;
        }
        else {
            return amount;

        }
    }

    static double withdraw(double balance) {

        double amount;

        System.out.print("Enter Withdraw: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient funds");
        }
        else if (amount < 0) {
            System.out.println("Cannot withdraw negative");
        }
        else {
            return amount;
        }

        return 0;
    }


}
