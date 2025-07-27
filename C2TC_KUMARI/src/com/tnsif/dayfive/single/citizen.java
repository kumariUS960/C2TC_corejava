package com.tnsif.dayfive.single;

public class citizen {
	private String name;
	private String aadharno;
	private String address;
	private String phno;
	
	public citizen() {
		System.out.println("Citizen object created");
	}
	
	public citizen(String name,String aadharno,String address,String phno) {
		
		this.name=name;
		this.aadharno=aadharno;
		this.address=address;
		this.phno=phno;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAadharno() {
		return aadharno;
	}

	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "citizen [name=" + name + ", aadharno=" + aadharno + ", address=" + address + ", phno=" + phno + "]";
	}
	
	
	

}
