package com.tnsif.dayfour.base;

public class base {
//	declaring the four types
	int vardefault =10;
	public int varPublic=20;
	private int varPrivate=30;
	private int varProtected=40;
	public int varprotected;
	public Object varpublic;
	
// declaring the methods with four types
      void methoddefault(){
    	  System.out.println("default access base class:");
    	  System.out.println("default vraiable:" +vardefault);
		
	}
      public void methodPublic() {
    	  System.out.println("Public access base class:");
    	  System.out.println("Public variable:" +varPublic);
    	  
    	   }
      private void methodPrivate() {
    	  System.out.println("Private access base class:");
    	  System.out.println("Private varaible:" +varPrivate);
      }
      void methodprotected() {
    	  System.out.println("Protected access base class:");
    	  System.out.println("Protected varaible:" +varProtected);

}
      
}
