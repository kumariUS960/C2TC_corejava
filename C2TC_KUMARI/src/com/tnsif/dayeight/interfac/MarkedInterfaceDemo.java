package com.tnsif.dayeight.interfac;

public class MarkedInterfaceDemo {
	
	public static void main(String[] args) {
		Student s=new Student(101,"kumari",12000,"C++");
		if (s instanceof Registrable)
			System.out.println("Student is registered for the course");
		else
			System.out.println("Student is not registered for the course");
	}

}
