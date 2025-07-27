package com.tnsif.daysix.stati;

public class Account {
	abstract class account {
	    protected double balance;
	    protected String accountHolder;

	    public account(String holder, double initialBalance) {
	        this.accountHolder = holder;
	        this.balance = initialBalance;
	    }

	    // Abstract methods to be implemented in subclasses
	    public abstract void deposit(double amount);
	    public abstract void withdraw(double amount);
	    public abstract double getBalance();

	    // Common method
	    public void displayInfo() {
	        System.out.println("Account Holder: " + accountHolder);
	        System.out.println("Current Balance: ₹" + getBalance());
	    }
	}

	// Subclass: SavingsAccount
	class SavingsAccount extends Account {
	    private double interestRate = 0.03; // 3% annual interest

	    public SavingsAccount(String holder, double initialBalance) {
	        super();
	    }

	    @Override
	    public void deposit(double amount) {
	        if (amount > 0) {
	            double balance = amount;
	            System.out.println("Deposited ₹" + amount + " in Savings Account");
	        }
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrew ₹" + amount + " from Savings Account");
	        } else {
	            System.out.println("Insufficient balance in Savings Account!");
	        }
	    }

	    @Override
	    public double getBalance() {
	        return balance;
	    }
	}

	// Subclass: CheckingAccount
	class CheckingAccount extends Account {
	    private double overdraftLimit = 1000.0;

	    public CheckingAccount(String holder, double initialBalance) {
	        super(holder, initialBalance);
	    }

	    @Override
	    public void deposit(double amount) {
	        if (amount > 0) {
	            double balance = amount;
	            System.out.println("Deposited ₹" + amount + " in Checking Account");
	        }
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount <= balance + overdraftLimit) {
	            balance -= amount;
	            System.out.println("Withdrew ₹" + amount + " from Checking Account");
	        } else {
	            System.out.println("Withdrawal exceeds overdraft limit!");
	        }
	    }

	    @Override
	    public double getBalance() {
	        return balance;
	    }
	}

	public void deposit(double amount) {
		
	}

	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}


}
