package com.tnsif.dayfive.mi;

import java.util.Date;

public class leveloneemployee extends employee {
	private int noofshares;
	private String authority;
	
	public void leveloneemployee() {} 

	public leveloneemployee(String name, long contactNo, Date dateOfBirth, String deptName, double baseSalary) {
		super(name, contactNo, dateOfBirth, deptName, baseSalary);
		this.authority=authority;
		this.noofshares=noofshares;
		
	}

	public int getNoofshares() {
		return noofshares;
	}

	public void setNoofshares(int noofshares) {
		this.noofshares = noofshares;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "leveloneemployee [noofshares=" + noofshares + ", authority=" + authority + "]";
	}
	

}
