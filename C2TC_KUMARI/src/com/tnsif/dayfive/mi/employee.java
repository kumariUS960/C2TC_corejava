package com.tnsif.dayfive.mi;
import java.util.Date;

public class employee extends person {
	private String deptname;
	private double basesalary;
	
	public void employee() {}

	public employee(String name, long contactNo, Date dateOfBirth, String deptName, double baseSalary) {
		super(name, contactNo, dateOfBirth);
		this.deptname = deptName;
		this.basesalary= baseSalary;
	}
		
	

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public double getBasesalary() {
		return basesalary;
	}

	public void setBasesalary(double basesalary) {
		this.basesalary = basesalary;
	}
	
	
	
	
	

}
