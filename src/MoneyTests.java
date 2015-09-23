import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class MoneyTests {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void add_value() {
		Money money = new Money(0);
		Money amount = new Money(1);
		
		Money result = money.add(amount);
		assertThat(new Money(1), is(equalTo(result)));
	}
	
	@Test
	public void subtract_value() {
		Money money = new Money(0);
		Money amount = new Money(1);
		
		Money result = money.subtract(amount);
		
		assertThat(new Money(-1), is(equalTo(result)));
	}
	
	@Test
	public void subtract_must_be_positive_value() {
		Money money = new Money(0);
		Money amount = new Money(-1000);
		
		try {
			money.subtract(amount);
			fail("Should throw exception");
		} catch(Exception e) {
			// pass
		}
	}
}
