package com.tnsif.daysix.stati;

public class FinalClassDemo {
	void show() {
		System.out.println("Final class can be inherited");
	}

}

class FinalChildClass extends FinalClassDemo{
	public static void main(String[] args) {
		FinalClassDemo f1=new FinalClassDemo();
		f1.show();
		
	}
	
}
