package day3;

public class Commision {
	private String name;
	private String address;
	private long phonenumber;
	private long sales_amount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public long getSales_amount() {
		return sales_amount;
	}
	public void setSales_amount(long sales_amount) {
		this.sales_amount = sales_amount;
	}
	@Override
	public String toString() {
		return "Commision [name=" + name + ", address=" + address + ", phonenumber=" + phonenumber + ", sales_amount="
				+ sales_amount + "]";
	}
	
	
	
	

}
