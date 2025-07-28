package com.tnsiff.dayseven.mol;

public class Overloadingdemo {
	public static void main(String[] args) {
		
		System.out.println("-----------------Constructor Overloading--------------");
		
		Point p =new Point();
		System.out.println(p);  //default constructor
		
		System.out.println("-----------------Method overloading---------");
		System.out.println("Addition of two integers:" +MethodOverloading.addition(3,4));
		System.out.println("Addition of three floating numbers:" +MethodOverloading.addition(4.4f,5.9f,6.0f));
		System.out.println("Addition of two floating numbers:" +MethodOverloading.addition1(4.9,9.8));
		System.out.println("Addition of two double numbers:" +MethodOverloading.addition2(4.5,8.9));
		System.out.println("Addition of two Strings:" +MethodOverloading.addition3("hello","world"));
	}

	

}
