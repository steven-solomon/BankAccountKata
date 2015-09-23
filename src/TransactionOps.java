
public class TransactionOps {
	public static void Transfer(Account source, Account destination, Money money) {
		source.Withdraw(money);
		destination.Deposit(money);
	}	
}