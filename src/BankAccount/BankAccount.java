
package src.BankAccount;

public class BankAccount {
    public static String accountNumber1 = "123456789";
    public static String accountNumber2 = "987654321";
    public static String accountHolderName1 = "John Doe";
    public static String accountHolderName2 = "Jane Doe";
    public static double balance1 = 1000.0;
    public static double balance2 = 500.0;

    public static void main(String[] args) {
        deposit(accountNumber1, 500.0);
        withdraw(accountNumber2, 200.0);

        System.out.println(accountHolderName1 + "'s balance is $" + balance1);
        System.out.println(accountHolderName2 + "'s balance is $" + balance2);
    }

    public static void deposit(String accountNumber, double amount) {
        if (accountNumber.equals(accountNumber1)) {
            balance1 += amount;
        } else if (accountNumber.equals(accountNumber2)) {
            balance2 += amount;
        }
    }

    public static void withdraw(String accountNumber, double amount) {
        if (accountNumber.equals(accountNumber1)) {
            balance1 -= amount;
        } else if (accountNumber.equals(accountNumber2)) {
            balance2 -= amount;
        }
    }
}
