package day3;

public class assigmentdemo2 {
	private static final int Salesamount = 0;

	public static void main(String[] args) {
		assignment2 s1=new assignment2(); 
		assignment2 s2=new assignment2(); 
		assignment2 s3=new assignment2(); 
		assignment2 s4=new assignment2();
		System.out.println("Student object is created: ");
		
		System.out.println("enter the salesamount:");
		if(Salesamount >= 100000) {
			int commission = 10*Salesamount;
		}
		else if(Salesamount >= 50000) {
			int commission = (int) (00.5*Salesamount);
			
		}else if(Salesamount >= 30000) {
			int commision = (int) (00.3*Salesamount);
			
		}else {
			int nocommision;
		}
		

			
		
		s1.setName("kumari");
		s1.setAddress("pondy");
		s1.setId(101);

		System.out.println(s1);
		
		s2.setName("hema");
		s2.setAddress("bahour");
		s2.setId(102);
		
		System.out.println(s2);
		
		s3.setName("nandyy");
		s3.setAddress("bgl");
		s3.setId(103);
		
		System.out.println(s3);
		
		
	
	}

}
