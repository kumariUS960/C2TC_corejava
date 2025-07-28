package com.tnsiff.dayseven.mol;

public class MethodOverloading {
	
	public static int addition(int a,int b) {
		return (a + b); 

	}
	
	public static float addition(float f,float g,float h) {
		return f + g + h;
	}
	
	public static float addition1(double d,double e ) {
		return  (float) (d+e) ;
	}
	
	public static double addition2(double d,double e) {
		return d + e;
		
	}
	
	public static String addition3(String a,String b) {
		return a + b ;
	}
	

}
