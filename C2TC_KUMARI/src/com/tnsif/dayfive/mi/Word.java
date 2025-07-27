package com.tnsif.dayfive.mi;

public class Word extends Wordpad{
	private boolean Spellcheckenabled;
	
	public Word() {
		super();
		this.Spellcheckenabled=true;
		
	}
	public void spellCheck() {
		if(Spellcheckenabled) {
			System.out.println("Running Spell check....");
		}else {
			System.out.println("Spell check is enabled.");
		}
	}
	
	public void enableSpellCheck(boolean enable) {
		Spellcheckenabled=enable;
	}
	

}
