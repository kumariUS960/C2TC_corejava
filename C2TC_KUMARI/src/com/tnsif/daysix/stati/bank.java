package com.tnsif.daysix.stati;

public class bank {
	private static final String AccountHolder = null;

	private static final String AccountNumber = null;

	private static int totalaccounts =0;
	
	private String accountholdername;
	private int Accountnumber;
	
	public bank(String accountholdername,int Accountnumber) {
		this.accountholdername=accountholdername;
		this.Accountnumber=Accountnumber;
		
		
		
	}
	public static int  gettotalaccounts() {
		return totalaccounts;
		
	}
	
	public void displayaccount() {
		System.out.println("AccountHolder:" +AccountHolder);
		System.out.println("AccountNumber:" +AccountNumber);
	}
	
	
	
	

}
