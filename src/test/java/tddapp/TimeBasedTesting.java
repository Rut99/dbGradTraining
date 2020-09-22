package tddapp;

import org.junit.Test;

public class TimeBasedTesting {

	@Test(timeout=500)
	public void testCrunchLargeNumbers() {
		new NumberCruncher().crunchLargeNumber();
	}
}
