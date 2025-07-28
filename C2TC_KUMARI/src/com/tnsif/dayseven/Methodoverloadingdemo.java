package com.tnsif.dayseven;

public class Methodoverloadingdemo {
	
	public static void main(String[] args) {
		
		Addition a =new Addition();
		a.add();
	   System.out.println(a.add(6));
	   System.out.println(a.add(6.8));
	   System.out.println(a.add(6,7));
	   
	   a.show(101, "kumari");
		


	}

}
