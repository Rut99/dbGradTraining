package tddapp;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestAccountApp {
	
	@BeforeClass
	public static void beforeAllTest() {
		//global init
		//run dbscript or create testing data
		System.out.println("First");
	}
	@AfterClass
	public static void afterAllTest() {
		//global cleanup
		//remove dbscript or testing data created
		System.out.println("Last");
	}
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
	@Test
	public void testAccountIDNotNull() {
		Account account=new Account();
		Object expected= account.getAccountID();
		assertNotNull(expected);
	}
	
	@Test
	@Ignore
	public void testAccountIDLength() {
		Account account=new Account();
		int expectedLength= 19;
		long actualAccountID=account.getAccountID();
		System.out.println(actualAccountID);
		int actualLength=0;
		while(actualAccountID!=0) {
			actualAccountID/=10;
			actualLength++;
		}
		System.out.println(actualLength);
		assertEquals(expectedLength, actualLength);
	}
	
	@Test(expected = Exception.class)
	public void testAccountIDShorterLength() {
		Account account=new Account();
		
	}
	
	@Test
	public void testAccountNonNegative() {
		Account account=new Account();
		assertTrue(account.getAccountID()>0);
	}
	
	@Test
	public void testAccountStartsWith9() {
		Account account=new Account();
		assertTrue((account.getAccountID()+"").startsWith("9"));
	}
	
	@Test
	public void testAccountIDasImmutable() {
		Account account=new Account();
		long originalID=account.getAccountID();
		long anotheroriginalID=account.getAccountID();
		assertEquals(originalID, anotheroriginalID);
	}
	

	
}
