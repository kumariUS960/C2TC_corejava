package com.tnsif.daysix.stati;

public class Finalvariable {
	
	int x=100;
	
	static int Y;
	
	static int Z=40;
	
	void change() {
		x=30;
		Y=100;
		
	}

	@Override
	public String toString() {
		return "Finalvariable [x=" + x + "]";
	}
	
	static {
		Y=20;
		Z=100;
		System.out.println("Value of Y:" +Y);
	}

}
