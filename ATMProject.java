import java.util.Scanner;

class ATM {

    int pin = 1234;
    double balance = 5000;

    void start() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == pin) {
            menu(sc);
        } else {
            System.out.println("Wrong PIN");
        }
    }

    void menu(Scanner sc) {
        int choice;

        do {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    balance += sc.nextDouble();
                    System.out.println("Amount Deposited");
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double amt = sc.nextDouble();
                    if (amt <= balance) {
                        balance -= amt;
                        System.out.println("Collect Cash");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);
    }
}

public class ATMProject {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.start();
    }
}
