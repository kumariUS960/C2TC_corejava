package com.tnsif.daysix.stati;

public class final1 {
	class Transaction {
	    private final double transactionFee = 5.0;

	  
	    public final void performTransaction(double amount) {
	        if (amount <= 0) {
	            System.out.println("Invalid amount. Transaction failed.");
	            return;
	        }

	        double totalAmount = amount + transactionFee;
	        process(totalAmount);
	    }

	   
	    protected void process(double totalAmount) {
	        System.out.println("Transaction processed. Total debited: $" + totalAmount);
	    }

	   
	    public double getTransactionFee() {
	        return transactionFee;
	    }
	}

	
	class BankTransaction extends Transaction {
	    // Can override process method if needed
	    @Override
	    protected void process(double totalAmount) {
	        System.out.println("Bank transaction successful. Amount debited: $" + totalAmount);
	    }

	    
	}


	public void performTransaction(double d) {
		
	}


	


}
