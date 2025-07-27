package com.tnsif.daysix.stati;

public class bankdemo {
	public static void main(String[] args) {
		bank b1=new bank("kumari",1001);
		bank b2=new bank("kaviya",1002);
		bank b3=new bank("kumar",1003);
		
		b1.displayaccount();
		b2.displayaccount();
		b3.displayaccount();
		
		System.out.println("Total number of bank accounts:" +bank.gettotalaccounts());
		
	}

}
