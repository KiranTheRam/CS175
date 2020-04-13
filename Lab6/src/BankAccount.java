public class BankAccount {
    private double balance;

    public BankAccount() {
        balance = 0;
    }

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void withdraw(double withdrawAmount) {
        balance -= withdrawAmount;
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void addInterest (double rate) {
        balance+= (balance * (rate/100));
    }
}
