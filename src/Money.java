
public class Money {
	public Money(int value) {
		amount = value;
	} 
	
	int amount;
	
	@Override
	public boolean equals(Object other)
	{
		return ((Money)other).amount == this.amount;
	}
	
	public Money add(Money money) {
		return new Money(money.amount + this.amount);
	}

	public Money subtract(Money money) {
		if (money.amount < 0) 
			throw new RuntimeException();
		return new Money(this.amount - money.amount);
	}
}