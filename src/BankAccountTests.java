import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class BankAccountTests {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_initial_account_balance_is_zero() {
		Account account = new Account(new Money(0));
		Money money = account.getBalance();
		
		assertThat(new Money(0), is(equalTo(money)));
	}
	
	@Test
	public void test_deposit()
	{
		Account account = new Account(new Money(0));
		
		Money deposit = new Money(50);
	
		account.Deposit(deposit);
		
		assertThat(new Money(50), is(equalTo(account.getBalance())));
	}

	@Test
	public void test_withdrawal()
	{
		Account account = new Account(new Money(0));
		
		Money withdrawal = new Money(30);
	
		account.Withdraw(withdrawal);
		
		assertThat(new Money(-30), is(equalTo(account.getBalance())));
	}
	
	@Test
	public void test_transfer()
	{
		Account source = new Account(new Money(50));
		Account destination = new Account(new Money(0));
		
		TransactionOps.Transfer(source, destination, new Money(30));
		
		assertThat(new Money(30), is(equalTo(destination.getBalance())));
		assertThat(new Money(20), is(equalTo(source.getBalance())));
	}
	
}