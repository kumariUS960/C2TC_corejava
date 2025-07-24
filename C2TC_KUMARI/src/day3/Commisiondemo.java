package day3;
import java.util.Scanner;

public class Commisiondemo {
	private static final int Sales_amount = 0;

	public static void main(String[] args) {
		student s1=new student();
		Commision c1=new Commision();
		
		c1.setName("kumari");
		c1.setAddress("Pondy");
		c1.setPhonenumber(87386483);
		c1.setSales_amount(30000);
		
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter sales amount: ");
	        double sales = sc.nextDouble();
	        double commission;

	        if (sales >= 100000) {
	            commission = sales * 0.10;
	        } else if (sales >= 50000) {
	            commission = sales * 0.05;
	        } else if (sales >= 30000) {
	            commission = sales * 0.03;
	        } else {
	            commission = 0;
	        }

	        System.out.printf("Sales: %.2f, Commission: %.2f%n", sales, commission);
	        sc.close();
		
	}

}
