package C2TC_assignment;
import java.util.Scanner;

public class productclass {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("Enter the product name:" +name);
		int quantity=sc.nextInt();
		System.out.println("Enter the quantity name:" +quantity);
		char quality=sc.next().charAt(0);
		System.out.println("Enter the quality of the product:" +quality);
		
		
		
	}

}
