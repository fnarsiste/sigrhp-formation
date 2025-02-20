package bj.formation.sigrhp.training.proxy;

public class DepositAccount implements IAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
        System.out.println("Sold::" + this.balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            return;
        }
        balance -= amount;
        System.out.println("Retract: " + amount + " - Sold::" + this.balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("deposit: " + amount + " - Sold::" + this.balance);
    }
}
