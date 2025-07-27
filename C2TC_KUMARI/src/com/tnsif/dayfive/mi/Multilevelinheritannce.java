package com.tnsif.dayfive.mi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Multilevelinheritannce {
	public static void main(String[] args) {
		
		person p1= new person("raja", 934426775, new Date(2004, 8, 11));
		System.out.println(p1);
		

		p1 = new employee("kumari", 979017436, new Date(1995, 05, 07), "Sales", 45000);
		System.out.println(p1);

		p1 = new leveloneemployee("Madhur", 9880807227l, new Date(1988, 15, 02), "Account", 85000);
		System.out.println(p1);
	}

}
