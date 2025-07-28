package com.tnsif.dayseven;
//abstract class
abstract class PaymentGateway{
	public abstract void paymentProcess(double amt);
	
	
	
	public void connectToPayment() 
	{
		System.out.println("Connecting to the Payment  Gateway......");
	}
}	
class Creditpayment extends PaymentGateway{
	public void paymentProcess(double amt) {
		System.out.println("Processing the amount Rs." +amt);
	}
	
}
public class PaymentSystem {
	public static void main(String[] args) {
		PaymentGateway payment;
		
		    payment = new Creditpayment();
	        payment.connectToPayment();
	        payment.paymentProcess(20000.0);

}
}
