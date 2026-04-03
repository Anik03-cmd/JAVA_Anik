interface Bank{

    float rateOfInterest();
    void bankName();

}

class customer{
    
    String name;
    int customerid;

    customer(String name, int customerid){
        this.name = name;
        this.customerid = customerid;
    }

    void showcustomerdetails(){
        System.out.println("Customer name: " + name);
        System.out.println("Customer id: " + customerid);
    }

}

class Account extends customer implements Bank{

    int balance;
    int accountNo;

    Account(String name, int customerid, int balance, int accountNo){
        super(name, customerid);
        this.balance = balance;
        this.accountNo = accountNo;
    }

    public void AccountDetails(){
        System.out.println("Bank Balance: " + balance);
        System.out.println("Account Number: " + accountNo);
    }

    public float rateOfInterest(){
        return 6.5f;
    }

    public void bankName(){
        System.out.println("Bank Name: ABC Bank");
    }

    public static void main(String[] args) {
        
        Account acc = new Account("Anik Biswas", 3456, 20000, 9845320);

        System.out.println("Rate of Interest:"+ acc.rateOfInterest());
        acc.bankName();
        acc.showcustomerdetails();
        acc.AccountDetails();
    }

   
}
