package tddapp;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test2 {
	@Before
	public void beforeTest() {
		System.out.println("Before");
	}
	@After
	public void afterTest() {
		System.out.println("After");
	}
	@Test
	public void testCreateAccount() {
		Account account=new Account();
		assertNotNull(account);

	}
}
