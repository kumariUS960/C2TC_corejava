package com.tnsif.dayseven.vone;

public class circle extends shape{
	private double radius;
	
	
	public circle(double radius) {
		this.radius=radius;
		
		
	}
	
	public void draw() {
		System.out.println("Drawing a circle with radius " + radius);
	}

	// Override erase method for Circle

	public void erase() {
		System.out.println("Erasing a circle with radius " + radius);


	}
}

	
	

	
	
	
	


