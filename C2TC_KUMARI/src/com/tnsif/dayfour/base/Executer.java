package com.tnsif.dayfour.base;

public class Executer {
	public static void main(String[] args) {
		
	
	base b1=new base();
	b1.methoddefault();
	b1.methodPublic();
	b1.methodprotected();
	
	b1.vardefault=11;
	b1.methoddefault();
	
//	private method cannot be accesible.
	
	b1.varPublic=33;
	b1.methodPublic();
	
	b1.varprotected=44;
	b1.methodprotected();
	
	System.out.println("b1 Instance of base");
	
	}
	
}

