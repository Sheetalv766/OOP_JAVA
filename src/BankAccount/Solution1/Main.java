package src.BankAccount.Solution1;

import src.BankAccount.Solution1.*;

public class Main{
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456789", "John Doe", 1000.0);
        System.out.println("Counter count till now : " + BankAccount.getCustomerCounter());
        BankAccount account2 = new BankAccount("987654321", "Jane Doe", 500.0);
        System.out.println("Counter count till now : " + BankAccount.getCustomerCounter());
    }
}
