package day1and2;

public class encapsulationdemo {
	public static void main(String[] args) {
		
		encapsulation a = new encapsulation();
		
		a.setId(167);
		a.setName("kums");
		
		System.out.println("ID: " + a.getId());
		System.out.println("Name:" + a.getName());
		
		System.out.println(a.toString());
				
	}

}
