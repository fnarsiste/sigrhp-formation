package bj.formation.sigrhp.training.proxy;

public class BankCheckProxy {
    private final DepositAccount account;

    public BankCheckProxy(DepositAccount account) {
        this.account = account;
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdrawal(double amount) {
        account.withdraw(amount);
    }

    public double getBalance() {
        return account.getBalance();
    }
}
