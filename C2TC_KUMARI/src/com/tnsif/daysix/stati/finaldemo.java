package com.tnsif.daysix.stati;

public class finaldemo {
	public class Main {
	    public static void main(String[] args) {
	        final1 bt = new final1();
	        bt.performTransaction(100.0);

	        
	        System.out.println("Transaction Fee: $" + bt.getTransactionFee());
	    }

}
