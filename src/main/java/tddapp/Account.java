package tddapp;

import java.util.Random;

public class Account {
	
	private long accountID;
	public Account() {
		this.setAccountID(new Random().nextLong());
	}
	public long getAccountID() {
		return accountID;
	}
	public void setAccountID(long accountID) {
		this.accountID = accountID;
	}
	
	private long generateRandomAccountID() {
//		long m=(long) Math.pow(10, 10-1);
		long m=(long)(new Random().nextDouble()*100000000L);
//		return m+ new Random().nextLong();
		return m;
	}
}
