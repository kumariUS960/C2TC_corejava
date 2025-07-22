package C2TC_assignment;
import java.util.Scanner;

public class studentclass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int id=sc.nextInt();
		char sec=sc.next().charAt(0);
		
		System.out.println("My name is:" +name);
		System.out.println("My id is:" +id);
		System.out.println("My sec is:" +sec);
		System.out.println();
		
	}

}
