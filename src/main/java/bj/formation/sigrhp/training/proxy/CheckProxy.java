package bj.formation.sigrhp.training.proxy;

public class CheckProxy {
    private final DepositAccount account;

    public CheckProxy(DepositAccount account) {
        this.account = account;
    }

    public void provisioning(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }
}
