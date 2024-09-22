package src.BankAccount.Solution1;

public class BankAccount {
    public String accountNumber;
    public String accountHolderName;
    private double balance;
    public static int customerCounter = 0;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        customerCounter++;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if(amount <= balance)
            balance -= amount;
        else 
            System.out.println("Not enough balance!!");
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public static int getCustomerCounter() {
        return customerCounter;
    }
}

