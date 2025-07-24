package day1and2;

public class operatorsdemo {
	public static void main(String[] args) {
		int a=10;
		int b=80;
		
		System.out.println("a and b value before the operations:" +a+  "" +b);
		
		++a;
		int c=++a +b+ a--;
		System.out.println("c value after the operations:" +c);
		
		++b;
		int d=++a +b+ a--;
		System.out.println("d value after the operations:" +d );
		
//		ternary operator
		int x=90;
		x = (x==90) ? 1:0;
		System.out.println(x);
	}

}
