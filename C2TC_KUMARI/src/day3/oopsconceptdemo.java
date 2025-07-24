package day3;

public class oopsconceptdemo {
	private int serialnum;
	private String city,name;
	public int getSerialnum() {
		return serialnum;
	}
	public void setSerialnum(int serialnum) {
		this.serialnum = serialnum;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "oopsconceptdemo [serialnum=" + serialnum + ", city=" + city + ", name=" + name + "]";
	}
	
	
	
	

}
