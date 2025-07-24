package com.tnsif.dayfour.base;

public class person {
	
	private String personName;
	private int personAge;
	private String personCity;
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public String getPersonCity() {
		return personCity;
	}
	public void setPersonCity(String personCity) {
		this.personCity = personCity;
	}
	@Override
	public String toString() {
		return "person [personName=" + personName + ", personAge=" + personAge + ", personCity=" + personCity + "]";
	}
	
	

}
