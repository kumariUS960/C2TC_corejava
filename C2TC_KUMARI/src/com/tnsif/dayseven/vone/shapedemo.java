package com.tnsif.dayseven.vone;

public class shapedemo {
	public static void main(String[] args) {
		// Create an array of Shape objects
		shape[] shapes = new shape[3];

		// Instantiate objects of Circle, Triangle, and Square
		shapes[0] = new circle(5.0);
		shapes[1] = new triangle(4.0, 3.0);
		shapes[2] = new square(0);

		
		for (shape shape : shapes) {
			shape.draw();
			shape.erase();
			System.out.println("----------------------"); 
		}

}
}
