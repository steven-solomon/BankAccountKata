
public class Account {
	public Account(/*AccountId id, */ Money balance)
	{
		Balance = balance;
	}
	
	public Money getBalance() {
		return Balance; 
	}
	
	public void Deposit(Money money) {
		Balance = Balance.add(money);
	}
	public void Withdraw(Money money) {
		Balance = Balance.subtract(money);
	}
	
	Money Balance;
}