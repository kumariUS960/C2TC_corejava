package interfaceexample;

public class Executer {
	public static void main(String[] args) {
		Coder c1;
//		trainer object
		c1=new trainer();
		c1.rules();
		
//		Student object
		c1=new Student();
		c1.rules();
		}

}
// the above program is for loose coupling that is only to change the object.
