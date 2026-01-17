import java.util.Scanner;

public class ATM {

    private double balance = 10000;
    private int pin = 1234;

    public boolean validatePin(int enteredPin) {
        return pin == enteredPin;
    }

    public void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Please collect your cash: ₹" + amount);
        }
    }

    public void changePin(int oldPin, int newPin) {
        if (pin == oldPin) {
            this.pin = newPin;
            System.out.println("PIN changed successfully!");
        } else {
            System.out.println("Incorrect old PIN!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();

        System.out.print("Enter your ATM PIN: ");
        int enteredPin = sc.nextInt();

        if (!atm.validatePin(enteredPin)) {
            System.out.println("Invalid PIN! Access Denied.");
            sc.close();
            return;
        }

        int choice;
        do {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Change PIN");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    atm.deposit(sc.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ₹");
                    atm.withdraw(sc.nextDouble());
                    break;
                case 4:
                    System.out.print("Enter old PIN: ");
                    int old = sc.nextInt();
                    System.out.print("Enter new PIN: ");
                    int next = sc.nextInt();
                    atm.changePin(old, next);
                    break;
                case 5:
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}