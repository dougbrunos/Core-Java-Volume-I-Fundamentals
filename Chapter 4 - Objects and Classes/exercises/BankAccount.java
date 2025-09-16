package exercises;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "BankAccount [balance=" + balance + "]";
    }

    public static void main(String[] args) {
        var bankAccount = new BankAccount(1000);
        System.out.println(bankAccount);
        bankAccount.deposit(500);
        System.out.println("Balance: " + bankAccount.getBalance());
        bankAccount.withdraw(200);
        System.out.println("Balance: " + bankAccount.getBalance());
    }

}
