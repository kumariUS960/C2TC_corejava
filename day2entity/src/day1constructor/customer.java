package day1constructor;

public class customer{
	private int id;
	private String name;
	private String city;
//	default constructor
	public customer() {
		System.out.println("default constructor called");
		this.id =111;
		this.name="kumari";
		this.city="pondy";
	}
	
//	parametrised constructor
    
	public customer(int id, String name, String city) {
//     this();//invoke the default constructor
    this(103,"narayana");
	this.id = id;
	this.name = name;
	this.city = city;
}
	
//	constructor overloading
	public customer(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
     public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "customer [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	

}
