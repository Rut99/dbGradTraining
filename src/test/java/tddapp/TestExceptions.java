package tddapp;

import org.junit.Test;

public class TestExceptions {

	@Test(expected=ArithmeticException.class)
	public void dividByZeroTest() {
		double b=100/0;
	}
}
