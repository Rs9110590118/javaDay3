import java.util.Scanner;

class BankAccount {
    double calculateInterest(double amount) {
        return 0;
    }
}

class SavingsAccount extends BankAccount {
    double calculateInterest(double amount) {
        return amount * 4 / 100;
    }
}

class FixedDepositAccount extends BankAccount {
    double calculateInterest(double amount) {
        return amount * 7 / 100;
    }
}

class Differentbank  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();

        BankAccount b;

        b = new SavingsAccount();
        System.out.println("Savings Interest: " + b.calculateInterest(amount));

        b = new FixedDepositAccount();
        System.out.println("Fixed Deposit Interest: " + b.calculateInterest(amount));
    }
}