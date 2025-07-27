package com.tnsif.daysix.stati;

public class employee {
	private String name;
	private int id;
	
	static String companyname = "TNS";
	
	employee(String name,int id) {
		this.name=name;
		this.id=id;
	}

	@Override
	public String toString() {
		return "employee [name=" + name + ", id=" + id + "]";
	}
	
	
	
	

}
