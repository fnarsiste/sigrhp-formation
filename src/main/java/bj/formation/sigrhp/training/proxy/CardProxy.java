package bj.formation.sigrhp.training.proxy;

public class CardProxy {
    private final DepositAccount account;

    public CardProxy(DepositAccount account) {
        this.account = account;
    }

    public void provisioning(double amount) {
        account.deposit(amount);
    }

    public void buy(double amount) {
        account.withdraw(amount);
    }

    public double getBalance() {
        return account.getBalance();
    }
}
