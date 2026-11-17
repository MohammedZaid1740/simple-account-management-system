package oops.bankaccountmanagementsystem;

class BankAccount {
    int accountNumber;
    String AccountHolderName;
    double balance;

    BankAccount(int accountNumber, String AccountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.AccountHolderName = AccountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void display() {
            System.out.println(this.accountNumber + " " + this.AccountHolderName + " " + this.balance);
        }
}

public class accmanagementsystem {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(12345, "John Doe", 1000.0);
        BankAccount account2 = new BankAccount(67890, "Jane Smith", 500.0);
        account1.display();
        account1.deposit(500.0);
        account1.withdraw(200.0);
        account1.display();
        account2.display();
        account2.deposit(300.0);
        account2.withdraw(100.0);
        account2.display();
    }
}