package com.tnsif.dayeight.abstraction;

public class AbstractDemo {
	public static void main(String[] args) {
		
	
	Square s1=new Square();
	Rectangle r1=new Rectangle();
	s1.calArea();
	s1.show();
	r1.calArea();
	r1.show();
	
	
	System.out.println("---------------------");
	
	Shape shape;
	shape=new Square(11.3f);
	
	shape.calArea();
	shape.show();
	
	shape=new Rectangle(10,30);
	
	shape.calArea();
	shape.show();
	
	
	
	}
}
