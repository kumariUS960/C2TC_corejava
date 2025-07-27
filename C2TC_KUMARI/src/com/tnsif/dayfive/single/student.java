package com.tnsif.dayfive.single;

public class student extends citizen {
	private int rollNo;
	private String collegeName;

	public student() {
		super();
	}

	public student(String name, String aadharNo, String address, long phno, int rollNo, String collegeName) {


		//accessing parent class constructor
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", Name=" + getName()
				+ ", AadharNo=" + getAadharno() + ", Address=" + getAddress() + ", Phno=" + getPhno()
				
				+ "]";
	}


}
