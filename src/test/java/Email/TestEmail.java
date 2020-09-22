package Email;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestEmail {
	static Email email=new Email();
	@BeforeClass
	public static void beforeAllTest() {
		System.out.println("before all test");
		email.setEmailID("rutuja.patil@db.com");
		email.setEmailSubject("Greeting");
		email.setEmailBody("hi hello bye");
		
	}
	@Test
	public void validEmail() {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                "[a-zA-Z0-9_+&*-]+)*@" + 
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                "A-Z]{2,7}$"; 
                  
		Pattern pat = Pattern.compile(emailRegex); 
		assertTrue(pat.matcher(email.getEmailID()).matches());
		
	}
	@Test
	public void subjectNotMoreThan25() {
		String sub=email.getEmailSubject();
		assertTrue(sub.length()<=25);
	}
	@Test(expected=ArithmeticException.class)
	public void subjectMoreThan25() {
		String sub=email.getEmailSubject();
		if(sub.length()>25)
		{
			int d=100/0;
		}
	}
	@Test(expected=ArithmeticException.class)
	public void dividByZeroTest() {
		double b=100/0;
	}
	@Test
	public void subjectNoSpecialChar() {
		String sub=email.getEmailSubject();
		Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
		Matcher match = pattern.matcher(sub);
	    boolean val = match.find();
		assertTrue(val);
	}
	@Test
	public void subjectNotNull() {
		String sub=email.getEmailSubject();
		boolean bool=sub.isEmpty();
		assertFalse(bool);
	}
	@Test
	public void bodyMustBeStringOrrNull() {
		String body=email.getEmailBody();
		boolean bool=body.isEmpty();
		boolean bool1=(body instanceof String) ;
		assertFalse(bool);
	}
	@Test
	public void attachmentNotMoreThan100() {
		fail();
	}
	
}
