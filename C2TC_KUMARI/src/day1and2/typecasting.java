package day1and2;

public class typecasting {
	public static void main(String[] args) {
//		widening
		byte b=10;
		int i=b;
		System.out.println(i);
		
		float a=10f;
		float s=a;
		System.out.println(s);
		
		double c=5d;
		double z=c;
		System.out.println(z);
		
		char var1='\u00A7';
		char y=var1;
		System.out.println(y);
		
//	narrowing	
		double f1= 11.23f;
		long l = (long) f1;
		System.out.println(l);
		
		byte b1=90;
		char ch=(char) b1;
		System.out.println(ch);
		
		long l1=732832762909l;
		byte b9=(byte) l1;
		System.out.println(b9);
		
		float f7=6.56f;
		char ch8=(char)f7;
		System.out.println(ch8);
		
		
		
	}


}
