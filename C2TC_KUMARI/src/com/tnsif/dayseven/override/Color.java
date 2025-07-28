package com.tnsif.dayseven.override;

public class Color {
	protected Color getColor() {
		Color s=new Color();
		return s;
		}

}
//this class will inherit from the class color and will override the getcolor() method returning the object of the type red class

class Red extends Color{

	@Override
	public String toString() {
		return "Red []";
	}
	
	public class covariantoverriding{
		public static void main(String[] args) {
			Color c1=new Color();
			Color c2=c1.getColor();
			System.out.println(c1);
			
			Red r1=new Red();
			Red r2=r1.getRed();
			System.out.println(r1);
		}
	}


	

	
	}
	
	
	
