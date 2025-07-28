package com.tnsif.dayseven;

public class Overridingdemo {
	
	public static void main(String[] args) {
		RBI rbi;
		
		rbi = new RBI();
		System.out.println(rbi.getRateOfInterest());

		rbi = new ICICI();
		System.out.println(rbi.getRateOfInterest());

		rbi = new HDFC();
		System.out.println(rbi.getRateOfInterest());

	}

}
