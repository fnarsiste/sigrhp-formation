package bj.formation.sigrhp.training.proxy;

import bj.formation.sigrhp.training.config.TestConfig;

public class CardProxy {
    private final DepositAccount account;
    //private final TestConfig testConfig;

    public CardProxy(DepositAccount account) {
        this.account = account;
        //this.testConfig = testConfig;
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
