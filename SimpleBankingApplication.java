import java.util.Scanner;

public class SimpleBankingApplication {

    private static double balance = 1000; // Initial balance for demonstration purposes

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Simple Banking Application!");

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter the withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    withdraw(withdrawalAmount);
                    break;

                case 3:
                    checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using Simple Banking Application. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: $" + balance);
        } else {
            System.out.println("Invalid amount. Please enter a positive value for deposit.");
        }
    }

    private static void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: $" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal unsuccessful.");
        } else {
            System.out.println("Invalid amount. Please enter a positive value for withdrawal.");
        }
    }

    private static void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }
}
