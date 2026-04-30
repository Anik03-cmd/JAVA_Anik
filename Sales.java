import java.util.*;

interface SalesDepartment {
    void processSale(double amount);
}

interface FinanceDepartment {
    void generateInvoice(String name, double amount);
}

class CommercialExecutive implements SalesDepartment, FinanceDepartment {
    double lastSale;
    String client;

    public void processSale(double amount) {
        lastSale = amount;
        System.out.println("Sale done: " + amount);
    }

    public void generateInvoice(String name, double amount) {
        client = name;
        System.out.println("Invoice for " + name + " amount " + amount);
    }

    void showSummary() {
        System.out.println("Client: " + client + " Sale: " + lastSale);
    }
}

public class Sales {
    public static void main(String[] args) {
        CommercialExecutive c = new CommercialExecutive();
        c.processSale(5000);
        c.generateInvoice("Anik", 5000);
        c.showSummary();
    }
}