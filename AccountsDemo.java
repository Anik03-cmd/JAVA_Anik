import java.util.*;

abstract class Accounts {
    double balance;
    int accountNumber;
    String name, address;

    Accounts(double b, int a, String n, String ad) {
        balance = b;
        accountNumber = a;
        name = n;
        address = ad;
    }

    abstract void withdraw(double amt);
    abstract void deposit(double amt);

    void display() {
        System.out.println(accountNumber + " " + balance);
    }
}

class SavingsAccount extends Accounts {
    double rate;

    SavingsAccount(double b, int a, String n, String ad, double r) {
        super(b, a, n, ad);
        rate = r;
    }

    void withdraw(double amt) {
        balance -= amt;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void calculateAmount() {
        balance = balance + (balance * rate / 100);
    }
}

public class AccountsDemo {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(1000, 1, "Anik", "Kolkata", 5);
        s.deposit(500);
        s.withdraw(200);
        s.calculateAmount();
        s.display();
    }
}