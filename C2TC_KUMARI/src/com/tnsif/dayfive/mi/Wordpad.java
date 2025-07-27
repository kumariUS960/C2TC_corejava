package com.tnsif.dayfive.mi;

public class Wordpad extends notepad {
	private Boolean isBold;
	
	public Wordpad() {
		super();
		this.isBold = false;
	}
	
	public void formatText(boolean Bold) {
		if(Bold) {
			content ="<b>" +content + "</b>";
			
		}
		isBold=Bold;
		
	}
	public boolean isBold() {
		return isBold;
	}

}
