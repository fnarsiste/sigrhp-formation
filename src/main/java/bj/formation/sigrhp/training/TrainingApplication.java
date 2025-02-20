package bj.formation.sigrhp.training;

import bj.formation.sigrhp.training.proxy.BankCheckProxy;
import bj.formation.sigrhp.training.proxy.CardProxy;
import bj.formation.sigrhp.training.proxy.DepositAccount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingApplication.class, args);
		DepositAccount account = new DepositAccount();
		account.setBalance(10000.0);
//		CardProxy cardProxy = new CardProxy(account);
//		cardProxy.buy(239);
//		cardProxy.provisioning(90);
//		cardProxy.buy(2345);

		BankCheckProxy bankCheckProxy = new BankCheckProxy(account);
		bankCheckProxy.withdrawal(5000);
		bankCheckProxy.deposit(1000);
		bankCheckProxy.withdrawal(2000);

		System.out.println("Remaining balance" + bankCheckProxy.getBalance());
	}

}
