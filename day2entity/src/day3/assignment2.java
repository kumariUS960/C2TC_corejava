package day3;

public class assignment2 {
	private String name,Address;
	private int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "assignment2 [name=" + name + ", Address=" + Address + ", id=" + id + ", salesamount=" + "]";
	}
	
	

}
