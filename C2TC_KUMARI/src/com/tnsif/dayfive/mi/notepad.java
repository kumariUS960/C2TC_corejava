package com.tnsif.dayfive.mi;

public class notepad {
	protected String content;
	
	public notepad() {
		this.content="";
		
		
		}
	public void write(String text) {
		content+=text;
	}
	public void displayContent() {
		System.out.println("Notepad Content:" +content);
	}
	

}
